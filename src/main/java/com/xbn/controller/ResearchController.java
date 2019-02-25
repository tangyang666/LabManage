package com.xbn.controller;


import com.xbn.pojo.PageInfo;
import com.xbn.pojo.ResearchInfo;
import com.xbn.service.ResearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value="/research")
public class ResearchController extends BaseController{
    @Autowired
    private ResearchService researchService;
    @RequestMapping(value = "record.do", method = RequestMethod.POST)
    public void Record(HttpServletRequest req, HttpServletResponse resp) {
        ResearchInfo researchInfo=new ResearchInfo();
        String labId = req.getParameter("labid");
        String researchName = req.getParameter("researchname");
        String researchAuthor = req.getParameter("researchautho");
        String researchType = req.getParameter("researchtype");
        String researchPublicationName = req.getParameter("researchpublicationname");
        String researchPublicatuinTime = req.getParameter("researchpublicatuintime");
        String awardingUnit = req.getParameter("awardingunit");
        String researchWay = req.getParameter("researchway");
        String researchContent=req.getParameter("researchcontent");
        researchInfo.setResearchAwardingunit(awardingUnit);
        researchInfo.setLabId(labId);
        researchInfo.setResearchAuthor(researchAuthor);
        researchInfo.setResearchName(researchName);
        researchInfo.setResearchPublicationname(researchPublicationName);
        researchInfo.setResearchPublicationtime(researchPublicatuinTime);
        researchInfo.setResearchType(researchType);
        researchInfo.setResearchWay(researchWay);
        researchInfo.setResearchContent(researchContent);
        System.out.println(researchInfo);
        if (researchService.addResearch(researchInfo)==0) {
            Map map = new HashMap();
            map.put("message","添加成功");
            map.put("code","0");
            resolveJsonReturn(resp, map);
        } else {
            Map map = new HashMap();
            map.put("message","添加失败，请重新添加");
            map.put("code","1");
            resolveJsonReturn(resp, map);
        }
    }

    @RequestMapping(value = "search.do", method = RequestMethod.POST)
    public void Search(HttpServletRequest req, HttpServletResponse resp) {
        ResearchInfo researchInfo=new ResearchInfo();
        String pageNumber = req.getParameter("pageNumber");
        String condition=req.getParameter("result");
        int conditionInt = Integer.parseInt(req.getParameter("condition"));
        switch(conditionInt){
            case 1:researchInfo.setResearchName(condition);break;
            case 2:researchInfo.setLabId(condition);break;
            case 3:researchInfo.setResearchAuthor(condition);break;
        }
        PageInfo pageInfo=researchService.selResearchByPage(researchInfo,pageNumber);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("pageinfo",pageInfo);
        resolveJsonReturn(resp, map);
    }

}
