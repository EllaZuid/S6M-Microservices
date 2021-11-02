package DressuurMicroservice.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "scoreProef")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class ScoreProef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private int oneHP;
    private int oneHalfP;
    private int oneCorr;
    private String oneNotes;

    @NotNull
    private int twoHP;
    private int twoHalfP;
    private int twoCorr;
    private String twoNotes;

    @NotNull
    private int threeHP;
    private int threeHalfP;
    private int threeCorr;
    private String threeNotes;

    @NotNull
    private int fourHP;
    private int fourHalfP;
    private int fourCorr;
    private String fourNotes;

    @NotNull
    private int fiveHP;
    private int fiveHalfP;
    private int fiveCorr;
    private String fiveNotes;

    @NotNull
    private int sixHP;
    private int sixHalfP;
    private int sixCorr;
    private String sixNotes;

    @NotNull
    private int sevenHP;
    private int sevenHalfP;
    private int sevenCorr;
    private String sevenNotes;

    @NotNull
    private int eightHP;
    private int eightHalfP;
    private int eightCorr;
    private String eightNotes;

    @NotNull
    private int nineHP;
    private int nineHalfP;
    private int nineCorr;
    private String nineNotes;

    @NotNull
    private int tenHP;
    private int tenHalfP;
    private int tenCorr;
    private String tenNotes;

    @NotNull
    private int elevenHP;
    private int elevenHalfP;
    private int elevenCorr;
    private String elevenNotes;

    @NotNull
    private int twelveHP;
    private int twelveHalfP;
    private int twelveCorr;
    private String twelveNotes;

    @NotNull
    private int thirteenHP;
    private int thirteenHalfP;
    private int thirteenCorr;
    private String thirteenNotes;

    @NotNull
    private int fourteenHP;
    private int fourteenHalfP;
    private int fourteenCorr;
    private String fourteenNotes;

    @NotNull
    private int fifteenHP;
    private int fifteenHalfP;
    private int fifteenCorr;
    private String fifteenNotes;

    @NotNull
    private int sixteenHP;
    private int sixteenHalfP;
    private int sixteenCorr;
    private String sixteenNotes;

    @NotNull
    private int seventeenHP;
    private int seventeenHalfP;
    private int seventeenCorr;
    private String seventeenNotes;

    @NotNull
    private int eighteenHP;
    private int eighteenHalfP;
    private int eighteenCorr;
    private String eighteenNotes;

    @NotNull
    private int nineteenHP;
    private int nineteenHalfP;
    private int nineteenCorr;
    private String nineteenNotes;

    @NotNull
    private int twentyHP;
    private int twentyHalfP;
    private int twentyCorr;
    private String twentyNotes;

    @NotNull
    private int twentyoneHP;
    private int twentyoneHalfP;
    private int twentyoneCorr;
    private String twentyoneNotes;

    @NotNull
    private int twentyonehalfHP;
    private int twentyonehalfHalfP;
    private int twentyonehalfCorr;
    private String twentyonehalfNotes;

    @NotNull
    private int twentytwoHP;
    private int twentytwoHalfP;
    private int twentytwoCorr;
    private String twentytwoNotes;

    @NotNull
    private int twentythreeHP;
    private int twentythreeHalfP;
    private int twentythreeCorr;
    private String twentythreeNotes;

    @NotNull
    private int twentyfourHP;
    private int twentyfourHalfP;
    private int twentyfourCorr;
    private String twentyfourNotes;

    @NotNull
    private int twentyfiveHP;
    private int twentyfiveHalfP;
    private int twentyfiveCorr;
    private String twentyfiveNotes;

    @NotNull
    private int twentysixHP;
    private int twentysixHalfP;
    private int twentysixCorr;
    private String twentysixNotes;

    @NotNull
    private int twentysevenHP;
    private int twentysevenHalfP;
    private int twentysevenCorr;
    private String twentysevenNotes;

    @NotNull
    private int twentyeightHP;
    private int twentyeightHalfP;
    private int twentyeightCorr;
    private String twentyeightNotes;

    @NotNull
    private int twentynineHP;
    private int twentynineHalfP;
    private int twentynineCorr;
    private String twentynineNotes;

    @NotNull
    private int thirtyHP;
    private int thirtyHalfP;
    private int thirtyCorr;
    private String thirtyNotes;

    @NotNull
    private int subtotaalHelePunten;
    private int subtotaalHalvePunten;
    private int subtotaalCorr;

    private int strafpunten;

    @NotNull
    private int eindtotaal;
}
