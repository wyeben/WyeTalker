package com.wyeben.wyechat.utils;

import com.wyeben.wyechat.data.model.User;
import com.wyeben.wyechat.dto.response.RegisterUserResponse;
import com.wyeben.wyechat.dto.resquest.RegisterUserRequest;

public class Mapper {
    public static User map(RegisterUserRequest registerUserRequest, User user){
        user.setEmail(registerUserRequest.getEmail());
        user.setPassword(registerUserRequest.getPassword());
        user.setUserName(registerUserRequest.getUserName());

        return user;
    }
    public static RegisterUserResponse map(User user, RegisterUserResponse registerUserResponse){
        registerUserResponse.setUserName(user.getUserName());
        registerUserResponse.setEmail(user.getEmail());
        registerUserResponse.setMessage("Registration successful");

    return registerUserResponse;
    }

    public static User map(RegisterUserRequest registerUserRequest) {
        User user = new User();

        user.setEmail(registerUserRequest.getEmail());
        user.setPassword(registerUserRequest.getPassword());
        user.setUserName(registerUserRequest.getUserName());

        return user;
    }

//    public static User map(RegisterUserRequest registerUserRequest, Class<User> userClass) {
//
//        user.setEmail(registerUserRequest.getEmail());
//        user.setPassword(registerUserRequest.getPassword());
//        user.setUserName(registerUserRequest.getUserName());
//
//    }
}
