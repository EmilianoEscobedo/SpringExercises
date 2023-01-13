package com.example.SpringDeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    String message;

    @Value("${app.userEnv}")
    String user;

    @GetMapping("/hello")
    public String helloWorld(){
        return message + "and my name is " + user;
    }

}
