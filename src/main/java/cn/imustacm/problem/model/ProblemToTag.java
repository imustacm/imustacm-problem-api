package cn.imustacm.problem.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

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
@TableName("problem_to_tag")
public class ProblemToTag extends Model<ProblemToTag> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer problemId;

    private Integer problemTagId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
