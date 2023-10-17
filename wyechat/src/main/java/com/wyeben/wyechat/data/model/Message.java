package com.wyeben.wyechat.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Messages")
public class Message {
    @Id
    private String id;
    private String body;
    private String messageId;
    private boolean isRead;
    private String chatId;
}
