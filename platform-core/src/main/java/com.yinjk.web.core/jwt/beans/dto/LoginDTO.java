package com.yinjk.web.core.jwt.beans.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

@ApiModel(value = "LoginDTO", description = "登录表单")
public class LoginDTO{

    @NotEmpty
    @ApiModelProperty(value = "用户名", required = true)
    private String userName;

    @NotEmpty
    @ApiModelProperty(value = "用户密码", required = true)
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}