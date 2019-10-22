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
public class SubmitCodeDTO {

    private String language;

    private String code;

    private Integer problem_id;

    private Integer contest_id;

}
