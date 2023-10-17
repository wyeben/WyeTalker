package com.wyeben.wyechat.dto.resquest;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String email;
    private String password;
    private String userName;

}
