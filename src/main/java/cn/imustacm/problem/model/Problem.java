package cn.imustacm.problem.model;

import cn.imustacm.common.utils.LocalDateTimeJsonDeserializer;
import cn.imustacm.common.utils.LocalDateTimeJsonSerializable;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liandong
 * @since 2019-09-10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("problem")
public class Problem extends Model<Problem> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String description;

    private String input;

    private String output;

    private String sample;

    private String testCaseId;

    private String testCaseScore;

    private String hint;

    private String languages;

    private Integer timeLimit;

    private Integer memoryLimit;

    private Integer difficulty;

    private String source;

    private Integer problem_type;

    private Integer submitNumber;

    private Integer acceptedNumber;

    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime createTime;

    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime lastUpdateTime;

    private Integer createUser;

    private Boolean visible;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
