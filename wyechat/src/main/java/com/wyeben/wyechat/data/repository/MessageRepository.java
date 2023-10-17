package com.wyeben.wyechat.data.repository;

import com.wyeben.wyechat.data.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
}
