package cn.imustacm.problem.dto;


import cn.imustacm.problem.model.Problem;
import cn.imustacm.problem.model.ProblemFunction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 绑定SubmissionDTO
 *
 * @author wangjianli
 * Date: 2019/10/28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionDTO {

    private Integer id;

    private Integer problemId;

    private Integer contestId;

    private Integer userId;

    private LocalDateTime createTime;

    private Integer result;

    private String language;

    private Boolean codeShare;

    private String ip;

    private Integer judgeServer;

    private LocalDateTime judgeTime;

    private Integer passRate;

}
