package cn.imustacm.problem.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class ProblemToTagDTO {

    private Integer problemId;

    private Integer problemTagId;

    private String name;

}
