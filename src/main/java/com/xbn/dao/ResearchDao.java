package com.xbn.dao;

import com.xbn.pojo.PageInfo;
import com.xbn.pojo.ResearchInfo;

import java.util.List;

public interface ResearchDao {
    public Integer addResearch(ResearchInfo  researchInfo);
    public List<ResearchInfo>  selResearchByPage(ResearchInfo  researchInfo);
    public int count();
}
