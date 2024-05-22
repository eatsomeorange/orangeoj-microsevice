package com.taotao.orangebackendmodel.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author <a href="https://github.com/litaotao">程序员焘焘</a>
 * @from <a href="www.buhaotao.com">Taotao-Blog</a>
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
