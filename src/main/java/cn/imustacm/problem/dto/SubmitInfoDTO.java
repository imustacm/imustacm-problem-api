package cn.imustacm.problem.dto;


import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 绑定SubmitInfoDTO
 *
 * @author wangjianli
 * Date: 2019/10/24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmitInfoDTO {

    private String judge_id;

    private String err;

    private JSONObject judge_result;

}
