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
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Contest extends Model<Contest> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String content;

    private Boolean closeRankFlag;

    private Integer closeRankTime;

    private Boolean contestFlag;

    private Integer permissionType;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private LocalDateTime createTime;

    private LocalDateTime lastUpdateTime;

    private Integer createUser;

    private Boolean allowMail;

    private Boolean visible;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
