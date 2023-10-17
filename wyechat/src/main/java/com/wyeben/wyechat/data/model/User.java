package com.wyeben.wyechat.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Users")
@Data
public class User {
    @Id
    private String id;
    private String email;
    private String password;
    private String userName;


}
