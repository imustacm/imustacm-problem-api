package cn.imustacm.problem.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *
 * @author wangjianli
 * @since 2019-10-09
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("judge_server")
public class JudgeServer extends Model<JudgeServer> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String token;

    private String host;

    private String judgerVersion;

    private Boolean visible;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
