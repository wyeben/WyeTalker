package com.wyeben.wyechat.service;

import com.wyeben.wyechat.data.model.User;
import com.wyeben.wyechat.data.repository.UserRepository;
import com.wyeben.wyechat.dto.response.RegisterUserResponse;
import com.wyeben.wyechat.dto.resquest.RegisterUserRequest;
import com.wyeben.wyechat.utils.Mapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;
    ModelMapper modelMapper = new ModelMapper();
    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) {

        User user = modelMapper.map( registerUserRequest, User.class);

       User savedUser = userRepository.save(user);

        RegisterUserResponse registerUserResponse = new RegisterUserResponse();

        BeanUtils.copyProperties(savedUser, registerUserResponse);
        registerUserResponse.setMessage("Registration successful");

        return registerUserResponse;
    }
}
