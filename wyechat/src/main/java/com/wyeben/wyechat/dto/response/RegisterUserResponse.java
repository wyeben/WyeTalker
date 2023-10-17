package com.wyeben.wyechat.dto.response;

import lombok.Data;

@Data
public class  RegisterUserResponse {
    private String email;
   private String userName;
   private String message;
}
