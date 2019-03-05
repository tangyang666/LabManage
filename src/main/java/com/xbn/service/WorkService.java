package com.xbn.service;

import com.xbn.pojo.PageInfo;
import com.xbn.pojo.WorkRecordInfo;

import java.util.List;

public interface WorkService {
    public int addRecord(WorkRecordInfo workRecordInfo);
    public List<WorkRecordInfo> selWork();
}
