package com.wyeben.wyechat.data.repository;

import com.wyeben.wyechat.data.model.Chat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRepository extends MongoRepository<Chat, String> {

}
