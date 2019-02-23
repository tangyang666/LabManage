package com.xbn.pojo;

import java.util.Date;

public class ResearchInfo  {
    private int id;
    private String labId;
    private String researchName;
    private String researchAutho;
    private String researchType;
    private String researchPublicationName;
    private String researchPublicatuinTime;
    private String awardingUnit;
    private String researchWay;
    private String researchContent;

    public String getResearchContent() {
        return researchContent;
    }
    public void setResearchContent(String researchContent) {
        this.researchContent = researchContent;
    }

    public String getResearchWay() {
        return researchWay;
    }
    public void setResearchWay(String researchWay) {
        this.researchWay = researchWay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getResearchAutho() {
        return researchAutho;
    }

    public void setResearchAutho(String researchAutho) {
        this.researchAutho = researchAutho;
    }

    public String getResearchType() {
        return researchType;
    }

    public void setResearchType(String researchType) {
        this.researchType = researchType;
    }

    public String getResearchPublicationName() {
        return researchPublicationName;
    }

    public void setResearchPublicationName(String researchPublicationName) {
        this.researchPublicationName = researchPublicationName;
    }

    public String getResearchPublicatuinTime() {
        return researchPublicatuinTime;
    }

    public void setResearchPublicatuinTime(String researchPublicatuinTime) {
        this.researchPublicatuinTime = researchPublicatuinTime;
    }

    public String getAwardingUnit() {
        return awardingUnit;
    }

    public void setAwardingUnit(String awardingUnit) {
        this.awardingUnit = awardingUnit;
    }
}
