package cn.imustacm.problem.dto;


import cn.imustacm.problem.model.Problem;
import cn.imustacm.problem.model.ProblemFunction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 绑定ProblemDTO
 *
 * @author wangjianli
 * Date: 2019/10/28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDTO {

    private Problem problem;

    private List<ProblemToTagDTO> tags;

    private ProblemFunction problemFunction;

}
