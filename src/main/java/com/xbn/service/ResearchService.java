package com.xbn.service;

import com.xbn.pojo.PageInfo;
import com.xbn.pojo.ResearchInfo;

import java.util.List;

public interface ResearchService {
    public int addResearch(ResearchInfo researchInfo);
    public PageInfo selResearchByPage(ResearchInfo  researchInfo,String pageNumber);

}
