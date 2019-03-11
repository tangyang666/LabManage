package com.xbn.dao;

import com.xbn.pojo.PageInfo;
import com.xbn.pojo.ResearchInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResearchDao {
    public Integer addResearch(ResearchInfo  researchInfo);
    public List<ResearchInfo>  selResearchByPage(PageInfo  pageInfo);
    public int count(PageInfo  pageInfo);
    public ResearchInfo queryResearchInfoById(@Param("id") String id);
}
