package DressuurMicroservice.controller;

import DressuurMicroservice.entity.ScoreProef;
import DressuurMicroservice.logic.ScoreLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dressuur")
public class DressuurController {
    private ScoreLogic scoreLogic;

    @Autowired
    public DressuurController(ScoreLogic scoreLogic){
        this.scoreLogic = scoreLogic;
    }

    @GetMapping()
    public String getTest()
    {
        return "Dit is de dressuurcontroller";
    }

    @PostMapping()
    public ResponseEntity addProefScore(@RequestBody ScoreProef proef){
        boolean voltooid = this.scoreLogic.addProefScore(proef);
        if(voltooid){
            return new ResponseEntity(HttpStatus.OK);
        }
        else{
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
