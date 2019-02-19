package com.xbn.pojo;

import java.util.Date;

public class WorkRecordInfo {
    private String id;
    private String workRecordName;
    private String workRecordContent;
    private Date workRecordTime;
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkRecordName() {
        return workRecordName;
    }

    public void setWorkRecordName(String workRecordName) {
        this.workRecordName = workRecordName;
    }

    public String getWorkRecordContent() {
        return workRecordContent;
    }

    public void setWorkRecordContent(String workRecordContent) {
        this.workRecordContent = workRecordContent;
    }

    public Date getWorkRecordTime() {
        return workRecordTime;
    }

    public void setWorkRecordTime(Date workRecordTime) {
        this.workRecordTime = workRecordTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
