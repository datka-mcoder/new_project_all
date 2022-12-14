package peaksoft.new_project_all.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResultResponse {

    private String studentFullName;
    private Integer amountOfCorrectAnswers;
    private Integer amountOfWrongAnswers;
    private Integer point;


}
