package cn.imustacm.problem.model;

import cn.imustacm.common.utils.LocalDateTimeJsonDeserializer;
import cn.imustacm.common.utils.LocalDateTimeJsonSerializable;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liandong
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Submission extends Model<Submission> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer problemId;

    private Integer contestId;

    private Integer userId;

    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime createTime;

    private String code;

    private Integer result;

    private String language;

    private Boolean codeShare;

    private String statisticInfo;

    private String ip;

    private Integer judgeServer;

    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime judgeTime;

    private Integer passRate;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
