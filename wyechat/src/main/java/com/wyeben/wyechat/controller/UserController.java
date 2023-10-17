package com.wyeben.wyechat.controller;

import com.wyeben.wyechat.dto.response.RegisterUserResponse;
import com.wyeben.wyechat.dto.resquest.RegisterUserRequest;
import com.wyeben.wyechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    UserService userService;
public RegisterUserResponse register(RegisterUserRequest registerUserRequest){
    return userService.registerUser(registerUserRequest);
}
}
