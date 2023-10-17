package com.wyeben.wyechat.service;

import com.wyeben.wyechat.dto.response.RegisterUserResponse;
import com.wyeben.wyechat.dto.resquest.RegisterUserRequest;
import org.springframework.stereotype.Service;


public interface UserService {
    RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest);
}
