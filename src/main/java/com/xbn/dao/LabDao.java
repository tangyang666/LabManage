package com.xbn.dao;

import com.xbn.pojo.UserInfoPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabDao {
    List<UserInfoPojo> queryUserInfo();
}
