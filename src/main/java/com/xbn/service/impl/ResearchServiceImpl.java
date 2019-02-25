package com.xbn.service.impl;

import com.xbn.dao.ResearchDao;
import com.xbn.pojo.PageInfo;
import com.xbn.pojo.ResearchInfo;
import com.xbn.service.ResearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResearchServiceImpl implements ResearchService {
    @Autowired
    private ResearchDao researchDao;
    public int addResearch(ResearchInfo researchInfo){
        Integer index=researchDao.addResearch(researchInfo);
        if(index!=null){
            return 0;
        }
        else{
            return 1;
        }
    }

    public PageInfo selResearchByPage(ResearchInfo  researchInfo,String pageNumbers){
      int pageNumber=1;
      if(pageNumbers != null && pageNumbers != "") {
          pageNumber=Integer.parseInt(pageNumbers);
      }
     PageInfo pageInfo=new PageInfo();
     pageInfo.setPageStart(10*(pageNumber-1));
     pageInfo.setLabId(researchInfo.getLabId());
     pageInfo.setResearchAuthor(researchInfo.getResearchAuthor());
     pageInfo.setResearchName(researchInfo.getResearchName());

     int pageCount=researchDao.count(pageInfo);
     pageInfo.setTotal(pageCount%10==0?pageCount/10:(pageCount/10)+1);
     List<ResearchInfo> list=researchDao.selResearchByPage(pageInfo);
     pageInfo.setList(list);
     return pageInfo;
    }

}
