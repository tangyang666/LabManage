package com.xbn.pojo;

import java.util.List;

public class PageInfo {
    private int pageSize;
    private long total;
    private List<?> list;
    private int pageStart;
    private String labId;
    private String researchName;
    private String researchAutho;

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

    public String getResearchAutho() {
        return researchAutho;
    }

    public void setResearchAutho(String researchAutho) {
        this.researchAutho = researchAutho;
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

}
