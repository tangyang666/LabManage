package com.xbn.dao;

import com.xbn.pojo.ResearchInfo;
import com.xbn.pojo.WorkRecordInfo;

import java.util.List;

public interface WorkDao {
    public Integer addRecord(WorkRecordInfo workRecordInfo);
    public List<WorkRecordInfo> selWork();
}
