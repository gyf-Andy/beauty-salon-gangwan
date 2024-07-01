package org.gangwan.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.gangwan.pojo.BaseEntity;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

/**
 * <p>
 *
 * </p>
 *
 * @author 郭云飞
 * @since 2021-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("USER_INFO")
public class UserInfo extends BaseEntity {


    /**
     * 用户的账号
     */
    @TableId(value = "USER_ACCOUNT")
    private String userAccount;

    /**
     * 用户的密码
     */
    @TableField(value = "USER_PASSWORD")
    private String userPassword;

    /**
     * 用户的昵称
     */
    @TableField(value = "USER_NIKE_NAME")
    private String userNikeName;

    /**
     * 用户账号的注册时间
     */
    @TableField(value = "REGISTERED_DATE")
    private LocalDate registeredDate;

}
