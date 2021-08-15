package com.kukechen.keepgoing.controller;

import com.kukechen.keepgoing.entity.UserInfo;
import com.kukechen.keepgoing.mapper.UserInfoMapper;
import com.kukechen.keepgoing.utils.JsonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @GetMapping("/")
    public String index() {
        try {
            UserInfo user = userInfoMapper.selectByPrimaryKey(1);
            return JsonUtil.getJsonString(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Greetings from Spring Boot!";
    }
}