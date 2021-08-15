package com.kukechen.keepgoing.mapper;

import com.kukechen.keepgoing.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserInfoMapper {
    UserInfo selectByPrimaryKey(Integer id);
}