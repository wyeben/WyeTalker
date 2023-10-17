package com.wyeben.wyechat.service;

import com.wyeben.wyechat.data.repository.UserRepository;
import com.wyeben.wyechat.dto.response.RegisterUserResponse;
import com.wyeben.wyechat.dto.resquest.RegisterUserRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

@DataMongoTest
public class UserServiceTest {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private UserRepository userRepository;


    @Test
    public void testThatUserCanRegister(){
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setEmail("UserName");
        registerUserRequest.setPassword("Password");

        RegisterUserResponse response = userService.registerUser(registerUserRequest);

        assertThat(response, is(notNullValue()));

    }
}