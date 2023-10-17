package com.wyeben.wyechat.data.repository;

import com.wyeben.wyechat.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
