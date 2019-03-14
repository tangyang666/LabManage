package com.xbn.service.impl;

import com.xbn.dao.LabDao;
import com.xbn.pojo.PageInfo;
import com.xbn.pojo.ResearchInfo;
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

    public PageInfo queryUser(String pageNumbers, String useid) {
        PageInfo pageInfo=new PageInfo();
        int pageNumber=1;
        if(pageNumbers != null && pageNumbers != "") {
            pageNumber=Integer.parseInt(pageNumbers);
        }
        pageInfo.setPageStart(10*(pageNumber-1));
        pageInfo.setUserId(useid);
        int pageCount=labDao.count(pageInfo);
        pageInfo.setTotal(pageCount%10==0?(pageCount/10):(pageCount/10)+1);
        List<UserInfoPojo> list=labDao.queryUser(pageInfo);
        pageInfo.setList(list);
        return pageInfo;
    }
    public void delStudent(String userid){
        labDao.delStudent(userid);
    }
    public void upStudent(String userid){ labDao.upStudent(userid);  }
}
