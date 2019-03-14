package com.xbn.dao;

import com.xbn.pojo.PageInfo;
import com.xbn.pojo.UserInfoPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabDao {
    UserInfoPojo queryUserAndPassword(UserInfoPojo user);
    void addUser(UserInfoPojo user);
    int isNewUser(UserInfoPojo user);
    List<UserInfoPojo> queryUser(PageInfo pageInfo);
    void delStudent(String uerid);
    int count(PageInfo pageInfo);
    void upStudent(String userid);
}
