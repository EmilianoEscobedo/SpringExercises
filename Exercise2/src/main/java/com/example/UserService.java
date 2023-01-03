package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService newNotification;
    UserService(NotificationService newNotification){
        this.newNotification = newNotification;
    }
}
 