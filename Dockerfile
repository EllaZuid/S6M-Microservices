#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/AuthenticationMicroservice-1.0-jar-with-dependencies.jar /usr/local/lib/AuthenticationMicroservice.jar
EXPOSE 4000
ENTRYPOINT ["java", "-jar", "/usr/local/lib/demo.jar"]