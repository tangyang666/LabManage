package com.xbn.pojo;

import java.util.List;

public class PageInfo {
    private int pageSize = 10;
    private long total;
    private List<?> list;
    private int pageStart;
    private String labId;
    private String researchName;
    private String researchAuthor;
    private String userId;


    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public String getResearchName() {
        return researchName;
    }

    public void setResearchName(String researchName) {
        this.researchName = researchName;
    }



    public int getPageStart() {
        return pageStart;
    }
    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public List<?> getList() {
        return list;
    }
    public void setList(List<?> list) {
        this.list = list;
    }

    public String getResearchAuthor() {
        return researchAuthor;
    }

    public void setResearchAuthor(String researchAuthor) {
        this.researchAuthor = researchAuthor;
    }
}
