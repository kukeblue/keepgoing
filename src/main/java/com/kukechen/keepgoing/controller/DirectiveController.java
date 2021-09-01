package com.kukechen.keepgoing.controller;

import com.kukechen.keepgoing.entity.UserInfo;
import com.kukechen.keepgoing.utils.JsonUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectiveController {

    @GetMapping("/")
    public String index() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Greetings from Spring Boot!";
    }
}
