package DressuurMicroservice.controller;

import DressuurMicroservice.DTO.ScoreProefDTO;
import DressuurMicroservice.entity.ScoreProef;
import DressuurMicroservice.logic.ScoreLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
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
    public ResponseEntity addProefScore(@RequestBody ScoreProefDTO newProef){
        ScoreProef proef = ScoreProefDTOToScoreProef(newProef);
        boolean voltooid = this.scoreLogic.addProefScore(proef);
        if(voltooid){
            return new ResponseEntity(HttpStatus.OK);
        }
        else{
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    private ScoreProef ScoreProefDTOToScoreProef(ScoreProefDTO newProef){
        int value1 = newProef.getOneHP();
        int value2 = newProef.getOneHalfP();
        int value3 = newProef.getOneCorr();
        String value4 = newProef.getOneNotes();

        int value5 = newProef.getTwoHP();
        int value6 = newProef.getTwoHalfP();
        int value7 = newProef.getTwoCorr();
        String value8 = newProef.getTwoNotes();

        int value9 = newProef.getThreeHP();
        int value10 = newProef.getThreeHalfP();
        int value11 = newProef.getThreeCorr();
        String value12 = newProef.getThreeNotes();

        int value13 = newProef.getFourHP();
        int value14 = newProef.getFourHalfP();
        int value15 = newProef.getFourCorr();
        String value16 = newProef.getFourNotes();

        int value17 = newProef.getFiveHP();
        int value18 = newProef.getFiveHalfP();
        int value19 = newProef.getFiveCorr();
        String value20 = newProef.getFiveNotes();

        int value21 = newProef.getSixHP();
        int value22 = newProef.getSixHalfP();
        int value23 = newProef.getSixCorr();
        String value24 = newProef.getSixNotes();

        int value25 = newProef.getSevenHP();
        int value26 = newProef.getSevenHalfP();
        int value27 = newProef.getSevenCorr();
        String value28 = newProef.getSevenNotes();

        int value29 = newProef.getEightHP();
        int value30 = newProef.getEightHalfP();
        int value31 = newProef.getEightCorr();
        String value32 = newProef.getEightNotes();

        int value33 = newProef.getNineHP();
        int value34 = newProef.getNineHalfP();
        int value35 = newProef.getNineCorr();
        String value36 = newProef.getNineNotes();

        int value37 = newProef.getTenHP();
        int value38 = newProef.getTenHalfP();
        int value39 = newProef.getTenCorr();
        String value40 = newProef.getTenNotes();

        int value41 = newProef.getElevenHP();
        int value42 = newProef.getElevenHalfP();
        int value43 = newProef.getElevenCorr();
        String value44 = newProef.getElevenNotes();

        int value45 = newProef.getTwelveHP();
        int value46 = newProef.getTwelveHalfP();
        int value47 = newProef.getTwelveCorr();
        String value48 = newProef.getTwelveNotes();

        int value49 = newProef.getThirteenHP();
        int value50 = newProef.getThirteenHalfP();
        int value51 = newProef.getThirteenCorr();
        String value52 = newProef.getThirteenNotes();

        int value53 = newProef.getFourteenHP();
        int value54 = newProef.getFourteenHalfP();
        int value55 = newProef.getFourteenCorr();
        String value56 = newProef.getFourteenNotes();

        int value57 = newProef.getFifteenHP();
        int value58 = newProef.getFifteenHalfP();
        int value59 = newProef.getFifteenCorr();
        String value60 = newProef.getFifteenNotes();

        int value61 = newProef.getSixteenHP();
        int value62 = newProef.getSixteenHalfP();
        int value63 = newProef.getSixteenCorr();
        String value64 = newProef.getSixteenNotes();

        int value65 = newProef.getSeventeenHP();
        int value66 = newProef.getSeventeenHalfP();
        int value67 = newProef.getSeventeenCorr();
        String value68 = newProef.getSeventeenNotes();

        int value69 = newProef.getEighteenHP();
        int value70 = newProef.getEighteenHalfP();
        int value71 = newProef.getEighteenCorr();
        String value72 = newProef.getEighteenNotes();

        int value73 = newProef.getNineteenHP();
        int value74 = newProef.getNineteenHalfP();
        int value75 = newProef.getNineteenCorr();
        String value76 = newProef.getNineteenNotes();

        int value77 = newProef.getTwentyoneHP();
        int value78 = newProef.getTwentyoneHalfP();
        int value79 = newProef.getTwentyoneCorr();
        String value80 = newProef.getTwentyoneNotes();

        int value81 = newProef.getTwentyonehalfHP();
        int value82 = newProef.getTwentyonehalfHalfP();
        int value83 = newProef.getTwentyonehalfCorr();
        String value84 = newProef.getTwentyonehalfNotes();

        int value85 = newProef.getTwentytwoHP();
        int value86 = newProef.getTwentytwoHalfP();
        int value87 = newProef.getTwentytwoCorr();
        String value88 = newProef.getTwentytwoNotes();

        int value89 = newProef.getTwentythreeHP();
        int value90 = newProef.getTwentythreeHalfP();
        int value91 = newProef.getTwentythreeCorr();
        String value92 = newProef.getTwentythreeNotes();

        int value93 = newProef.getTwentyfourHP();
        int value94 = newProef.getTwentyfourHalfP();
        int value95 = newProef.getTwentyfourCorr();
        String value96 = newProef.getTwentyfourNotes();

        int value97 = newProef.getTwentyfiveHP();
        int value98 = newProef.getTwentyfiveHalfP();
        int value99 = newProef.getTwentyfiveCorr();
        String value100 = newProef.getTwentyfiveNotes();

        int value101 = newProef.getTwentysixHP();
        int value102 = newProef.getTwentysixHalfP();
        int value103 = newProef.getTwentysixCorr();
        String value104 = newProef.getTwentysixNotes();

        int value105 = newProef.getTwentysevenHP();
        int value106 = newProef.getTwentysevenHalfP();
        int value107 = newProef.getTwentysevenCorr();
        String value108 = newProef.getTwentysevenNotes();

        int value109 = newProef.getTwentyeightHP();
        int value110 = newProef.getTwentyeightHalfP();
        int value111 = newProef.getTwentyeightCorr();
        String value112 = newProef.getTwentyeightNotes();

        int value113 = newProef.getTwentynineHP();
        int value114 = newProef.getTwentynineHalfP();
        int value115 = newProef.getTwentynineCorr();
        String value116 = newProef.getTwentynineNotes();

        int value117 = newProef.getThirtyHP();
        int value118 = newProef.getThirtyHalfP();
        int value119 = newProef.getThirtyCorr();
        String value120 = newProef.getThirtyNotes();

        int value121 = newProef.getSubtotaalHelePunten();
        int value122 = newProef.getSubtotaalHalvePunten();
        int value123 = newProef.getSubtotaalCorr();

        int value124 = newProef.getStrafpunten();

        int value125 = newProef.getEindtotaal();

        ScoreProef proef =  new ScoreProef();
        proef.setId(1L);
        proef.setOneHP(value1);
        proef.setOneHalfP(value2);
        proef.setOneCorr(value3);
        proef.setOneNotes(value4);

        proef.setTwoHP(value5);
        proef.setTwoHalfP(value6);
        proef.setTwoCorr(value7);
        proef.setTwoNotes(value8);

        proef.setThreeHP(value9);
        proef.setThreeHalfP(value10);
        proef.setThreeCorr(value11);
        proef.setThreeNotes(value12);

        proef.setFourHP(value13);
        proef.setFourHalfP(value14);
        proef.setFourCorr(value15);
        proef.setFourNotes(value16);

        proef.setFiveHP(value17);
        proef.setFiveHalfP(value18);
        proef.setFiveCorr(value19);
        proef.setFiveNotes(value20);

        proef.setSixHP(value21);
        proef.setSixHalfP(value22);
        proef.setSixCorr(value23);
        proef.setSixNotes(value24);

        proef.setSevenHP(value25);
        proef.setSevenHalfP(value26);
        proef.setSevenCorr(value27);
        proef.setSevenNotes(value28);

        proef.setEightHP(value29);
        proef.setEightHalfP(value30);
        proef.setEightCorr(value31);
        proef.setEightNotes(value32);

        proef.setNineHP(value33);
        proef.setNineHalfP(value34);
        proef.setNineCorr(value35);
        proef.setNineNotes(value36);

        proef.setTenHP(value37);
        proef.setTenHalfP(value38);
        proef.setTenCorr(value39);
        proef.setTenNotes(value40);

        proef.setElevenHP(value41);
        proef.setElevenHalfP(value42);
        proef.setElevenCorr(value43);
        proef.setElevenNotes(value44);

        proef.setTwelveHP(value45);
        proef.setTwelveHalfP(value46);
        proef.setTwelveCorr(value47);
        proef.setTwelveNotes(value48);

        proef.setThirteenHP(value49);
        proef.setThirteenHalfP(value50);
        proef.setThirteenCorr(value51);
        proef.setThirteenNotes(value52);

        proef.setFourteenHP(value53);
        proef.setFourteenHalfP(value54);
        proef.setFourteenCorr(value55);
        proef.setFourteenNotes(value56);

        proef.setFifteenHP(value57);
        proef.setFifteenHalfP(value58);
        proef.setFifteenCorr(value59);
        proef.setFifteenNotes(value60);

        proef.setSixteenHP(value61);
        proef.setSixteenHalfP(value62);
        proef.setSixteenCorr(value63);
        proef.setSixteenNotes(value64);

        proef.setSeventeenHP(value65);
        proef.setSeventeenHalfP(value66);
        proef.setSeventeenCorr(value67);
        proef.setSeventeenNotes(value68);

        proef.setEighteenHP(value69);
        proef.setEighteenHalfP(value70);
        proef.setEighteenCorr(value71);
        proef.setEighteenNotes(value72);

        proef.setNineteenHP(value73);
        proef.setNineteenHalfP(value74);
        proef.setNineteenCorr(value75);
        proef.setNineteenNotes(value76);

        proef.setTwentyoneHP(value77);
        proef.setTwentyoneHalfP(value78);
        proef.setTwentyoneCorr(value79);
        proef.setTwentyoneNotes(value80);

        proef.setTwentyonehalfHP(value81);
        proef.setTwentyonehalfHalfP(value82);
        proef.setTwentyonehalfCorr(value83);
        proef.setTwentyonehalfNotes(value84);

        proef.setTwentytwoHP(value85);
        proef.setTwentytwoHalfP(value86);
        proef.setTwentytwoCorr(value87);
        proef.setTwentytwoNotes(value88);

        proef.setTwentythreeHP(value89);
        proef.setTwentythreeHalfP(value90);
        proef.setTwentythreeCorr(value91);
        proef.setTwentythreeNotes(value92);

        proef.setTwentyfourHP(value93);
        proef.setTwentyfourHalfP(value94);
        proef.setTwentyfourCorr(value95);
        proef.setTwentyfourNotes(value96);

        proef.setTwentyfiveHP(value97);
        proef.setTwentyfiveHalfP(value98);
        proef.setTwentyfiveCorr(value99);
        proef.setTwentyfiveNotes(value100);

        proef.setTwentysixHP(value101);
        proef.setTwentysixHalfP(value102);
        proef.setTwentysixCorr(value103);
        proef.setTwentysixNotes(value104);

        proef.setTwentysevenHP(value105);
        proef.setTwentysevenHalfP(value106);
        proef.setTwentysevenCorr(value107);
        proef.setTwentysevenNotes(value108);

        proef.setTwentyeightHP(value109);
        proef.setTwentyeightHalfP(value110);
        proef.setTwentyeightCorr(value111);
        proef.setTwentyeightNotes(value112);

        proef.setTwentynineHP(value113);
        proef.setTwentynineHalfP(value114);
        proef.setTwentynineCorr(value115);
        proef.setTwentynineNotes(value116);

        proef.setThirtyHP(value117);
        proef.setThirtyHalfP(value118);
        proef.setThirtyCorr(value119);
        proef.setThirtyNotes(value120);

        proef.setSubtotaalHelePunten(value121);
        proef.setSubtotaalHalvePunten(value122);
        proef.setSubtotaalCorr(value123);

        proef.setStrafpunten(value124);

        proef.setEindtotaal(value125);

        return proef;
    }
}
