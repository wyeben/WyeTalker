package com.wyeben.wyechat.data.repository;

import com.wyeben.wyechat.data.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DataMongoTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUserTest(){
        User user = new User();
        userRepository.save(user);
        assertThat(user.getId(), is(notNullValue()));
    }

}