package com.xbn.service;

import com.xbn.pojo.UserInfoPojo;

import java.util.List;

public interface LabService {
    public UserInfoPojo queryUserAndPassword(UserInfoPojo user);
    public void addUser(UserInfoPojo user);
    public  int isNewUser(UserInfoPojo user);

}
