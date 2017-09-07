package com.tangjing.project.model;


import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;
import java.util.Date;


/**
 * Describe:
 * User:tangjing
 * Date:2017/7/31
 * Time:下午10:38
 */
@Data
@Log4j2
@TableName("s_user")
@ApiModel("系统用户")
public class SysUser extends Model<SysUser> {

    @TableId
    @ApiModelProperty(value = "用户id")
    private int userId;

    //    @TableField("user_name")
    @ApiModelProperty(value = "用户名称")
    private String userName;

    //    @TableField("password")
    @ApiModelProperty(value = "用户密码")
    private String password;

    //    @TableField("login_ip")
    @ApiModelProperty(value = "用户IP")
    private String loginIp;

    //    @TableField("login_ip")
    @ApiModelProperty(value = "登录时间")
    private Date loginDate;

    //    @TableField("crt_date")
    @ApiModelProperty(value = "创建时间")
    private Date crtDate;

    //    @TableField("crt_user")
    @ApiModelProperty(value = "创建人")
    private String crtUser;

    //    @TableField("upd_date")
    @ApiModelProperty(value = "更新时间")
    private Date updDate;

    //    @TableField("upd_user")
    @ApiModelProperty(value = "更新人")
    private String updUser;

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }
}
