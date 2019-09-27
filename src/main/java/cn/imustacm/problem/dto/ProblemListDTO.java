package cn.imustacm.problem.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 绑定ProblemListDTO
 *
 * @author wangjianli
 * Date: 2019/09/24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProblemListDTO {

    private Integer id;

    private String title;

    private Integer difficulty;

    private String source;

    private Integer problemType;

    private Integer submitNumber;

    private Integer acceptedNumber;

    private String acceptedPercent;

    private List<ProblemToTagDTO> tags;

}
