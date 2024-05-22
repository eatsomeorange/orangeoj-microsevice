package com.taotao.orangebackendmodel.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 *
 * @author <a href="https://github.com/litaotao">程序员焘焘</a>
 * @from <a href="www.buhaotao.com">Taotao-Blog</a>
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;
}
