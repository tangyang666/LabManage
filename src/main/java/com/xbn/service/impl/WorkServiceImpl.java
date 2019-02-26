package com.xbn.service.impl;

import com.xbn.dao.WorkDao;
import com.xbn.pojo.WorkRecordInfo;
import com.xbn.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkServiceImpl implements WorkService{
    @Autowired
    private WorkDao workDao;
    public int addRecord(WorkRecordInfo workRecordInfo){
        Integer index= workDao.addRecord(workRecordInfo);
        if(index!=null){
            return 0;
        }
        else{
            return 1;
        }
    }

}
