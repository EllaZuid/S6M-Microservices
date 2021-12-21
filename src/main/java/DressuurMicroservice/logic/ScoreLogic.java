package DressuurMicroservice.logic;

import DressuurMicroservice.entity.ScoreProef;
import DressuurMicroservice.repo.IProefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScoreLogic {
    private final IProefRepo proefRepo;

    @Autowired
    public ScoreLogic(IProefRepo proefRepo) {
        this.proefRepo = proefRepo;
    }


    public boolean addProefScore(ScoreProef proef) {
        ScoreProef test = proefRepo.save(proef);

        if(test.getOneHP() == 0){
            return false;
        }
        return true;
    }
}
