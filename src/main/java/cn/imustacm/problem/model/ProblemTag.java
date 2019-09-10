package cn.imustacm.problem.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class ProblemTag extends Model<ProblemTag> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Boolean visible;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
