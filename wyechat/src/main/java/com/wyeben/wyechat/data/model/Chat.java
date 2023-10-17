package com.wyeben.wyechat.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("Chats")
public class Chat {
    @Id
    private String id;
    @DBRef
    private List<User> participant;
    private String chatName;
    private LocalDateTime dateRegistered = LocalDateTime.now();

}
