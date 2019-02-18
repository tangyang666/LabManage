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

    public List<UserInfoPojo> queryUserInfo() {
        List<UserInfoPojo> list = new ArrayList<UserInfoPojo>();
        list = labDao.queryUserInfo();
        return list;
    }
}
