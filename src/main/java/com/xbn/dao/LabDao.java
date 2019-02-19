package com.xbn.dao;

import com.xbn.pojo.UserInfoPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabDao {
    UserInfoPojo queryUserAndPassword(UserInfoPojo user);
    Integer addUser(UserInfoPojo user);
}
