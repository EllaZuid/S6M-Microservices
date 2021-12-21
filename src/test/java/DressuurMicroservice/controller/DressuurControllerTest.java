package DressuurMicroservice.controller;

import DressuurMicroservice.DTO.ScoreProefDTO;
import DressuurMicroservice.entity.ScoreProef;
import DressuurMicroservice.logic.ScoreLogic;
import DressuurMicroservice.repo.IProefRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DressuurControllerTest {

    IProefRepo proefRepoMock = mock(IProefRepo.class);
    ScoreLogic proefLogic = new ScoreLogic(proefRepoMock);

    DressuurController dressuurController;

    @BeforeEach
    public void setUp(){
        dressuurController = new DressuurController(proefLogic);
    }

    @Test
    void addProefScore() {
        ScoreProefDTO proef = createProef();
        ScoreProef dbProef = createDbProef();
        ResponseEntity returnResponseEntity;
        ResponseEntity expectedResponseEntity = new ResponseEntity(HttpStatus.OK);

        when(proefRepoMock.save(Mockito.any(ScoreProef.class))).thenAnswer(i -> i.getArguments()[0]);
        returnResponseEntity = dressuurController.addProefScore(proef);

        Assertions.assertEquals(expectedResponseEntity.getStatusCode(), returnResponseEntity.getStatusCode());

    }

    @Test
    void addEmptyProefScore() {
        ScoreProefDTO proef = createEmptyProef();
        ScoreProef dbProef = createDbProef();
        ResponseEntity returnResponseEntity;
        ResponseEntity expectedResponseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);

        when(proefRepoMock.save(Mockito.any(ScoreProef.class))).thenAnswer(i -> i.getArguments()[0]);
        returnResponseEntity = dressuurController.addProefScore(proef);

        Assertions.assertEquals(expectedResponseEntity.getStatusCode(), returnResponseEntity.getStatusCode());

    }

    private ScoreProefDTO createProef()
    {
        ScoreProefDTO proef =  new ScoreProefDTO();
        proef.setId(1L);
        proef.setOneHP(5);
        proef.setTwoHP(5);
        proef.setThreeHP(5);
        proef.setFourHP(5);
        proef.setFiveHP(5);
        proef.setSixHP(5);
        proef.setSevenHP(5);
        proef.setEightHP(5);
        proef.setNineHP(5);
        proef.setTenHP(5);
        proef.setElevenHP(5);
        proef.setTwelveHP(5);
        proef.setThirteenHP(5);
        proef.setFourteenHP(5);
        proef.setFifteenHP(5);
        proef.setSixteenHP(5);
        proef.setSeventeenHP(5);
        proef.setEighteenHP(5);
        proef.setNineteenHP(5);
        proef.setTwentyoneHP(5);
        proef.setTwentyonehalfHP(5);
        proef.setTwentytwoHP(5);
        proef.setTwentythreeHP(5);
        proef.setTwentyfourHP(5);
        proef.setTwentyfiveHP(5);
        proef.setTwentysixHP(5);
        proef.setTwentysevenHP(5);
        proef.setTwentyeightHP(5);
        proef.setTwentynineHP(5);
        proef.setThirtyHP(5);
        proef.setSubtotaalHelePunten(155);
        proef.setSubtotaalHalvePunten(0);
        proef.setSubtotaalCorr(0);
        proef.setStrafpunten(0);
        proef.setEindtotaal(155);
        return proef;
    }

    private ScoreProef createDbProef()
    {
        ScoreProef proef =  new ScoreProef();
        proef.setId(1L);
        proef.setOneHP(5);
        proef.setTwoHP(5);
        proef.setThreeHP(5);
        proef.setFourHP(5);
        proef.setFiveHP(5);
        proef.setSixHP(5);
        proef.setSevenHP(5);
        proef.setEightHP(5);
        proef.setNineHP(5);
        proef.setTenHP(5);
        proef.setElevenHP(5);
        proef.setTwelveHP(5);
        proef.setThirteenHP(5);
        proef.setFourteenHP(5);
        proef.setFifteenHP(5);
        proef.setSixteenHP(5);
        proef.setSeventeenHP(5);
        proef.setEighteenHP(5);
        proef.setNineteenHP(5);
        proef.setTwentyoneHP(5);
        proef.setTwentyonehalfHP(5);
        proef.setTwentytwoHP(5);
        proef.setTwentythreeHP(5);
        proef.setTwentyfourHP(5);
        proef.setTwentyfiveHP(5);
        proef.setTwentysixHP(5);
        proef.setTwentysevenHP(5);
        proef.setTwentyeightHP(5);
        proef.setTwentynineHP(5);
        proef.setThirtyHP(5);
        proef.setSubtotaalHelePunten(155);
        proef.setSubtotaalHalvePunten(0);
        proef.setSubtotaalCorr(0);
        proef.setStrafpunten(0);
        proef.setEindtotaal(155);
        return proef;
    }

    private ScoreProefDTO createEmptyProef(){
        ScoreProefDTO proef = new ScoreProefDTO();
        return proef;
    }
}