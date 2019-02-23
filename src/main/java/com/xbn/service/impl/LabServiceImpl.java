package com.xbn.service.impl;

import com.xbn.dao.LabDao;
import com.xbn.pojo.UserInfoPojo;
import com.xbn.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LabServiceImpl implements LabService {
    @Autowired
    private LabDao labDao;

    public UserInfoPojo queryUserAndPassword(UserInfoPojo user){
       UserInfoPojo  userInfo =  labDao.queryUserAndPassword(user);
        return userInfo;
    }
    public void  addUser(UserInfoPojo user){
         labDao.addUser(user);
    }
    public int isNewUser(UserInfoPojo user){
        return labDao.isNewUser(user);
    }
}
