package com.wondersgroup.springbootbabyrecord.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
@ApiModel(value = "用户BO",description = "用户登录注册使用")
public class UsersBO {


    /**
     * 用户名 用户名
     */
    @ApiModelProperty(value = "用户名",name = "用户名",notes = "用户名")
    private String username;

    /**
     * 密码 密码
     */
    @ApiModelProperty(value = "密码",name = "密码",notes = "密码")
    private String password;

    /**
     * 手机号 手机号
     */
    @ApiModelProperty(value = "手机号",name = "手机号",notes = "手机号")
    private String mobile;

    /**
     * 邮箱地址 邮箱地址
     */
    @ApiModelProperty(value = "邮箱地址",name = "邮箱地址",notes = "邮箱地址")
    private String email;

}