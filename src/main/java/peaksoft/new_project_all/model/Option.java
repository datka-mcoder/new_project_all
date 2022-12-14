package peaksoft.new_project_all.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "options")
@Getter
@Setter
@NoArgsConstructor
public class Option {

    @Id
    @GeneratedValue(generator = "option_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "option_gen",sequenceName = "option_seq",allocationSize = 1)
    private Long id;
    private String option;
    private Boolean isTrue;

    public Option(String option, Boolean isTrue) {
        this.option = option;
        this.isTrue = isTrue;
    }
}
