package cn.imustacm.problem.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
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

    private Boolean spjFlag;

    private Integer submitNumber;

    private Integer acceptedNumber;

    private LocalDateTime createTime;

    private LocalDateTime lastUpdateTime;

    private Integer createUser;

    private Boolean visible;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
