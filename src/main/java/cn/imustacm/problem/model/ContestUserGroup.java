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
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ContestUserGroup extends Model<ContestUserGroup> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer contestId;

    private Integer userGroupId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
