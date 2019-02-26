package com.xbn.pojo;

import java.util.Date;

public class WorkRecordInfo {
    private int id;
    private String workrecordName;
    private String workrecordContent;
    private String workrecordTime;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkrecordName() {
        return workrecordName;
    }

    public void setWorkrecordName(String workrecordName) {
        this.workrecordName = workrecordName;
    }

    public String getWorkrecordContent() {
        return workrecordContent;
    }

    public void setWorkrecordContent(String workrecordContent) {
        this.workrecordContent = workrecordContent;
    }

    public String getWorkrecordTime() {
        return workrecordTime;
    }

    public void setWorkrecordTime(String workrecordTime) {
        this.workrecordTime = workrecordTime;
    }

    @Override
    public String toString() {
        return "WorkRecordInfo{" +
                "id=" + id +
                ", workrecordName='" + workrecordName + '\'' +
                ", workrecordContent='" + workrecordContent + '\'' +
                ", workrecordTime='" + workrecordTime + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
