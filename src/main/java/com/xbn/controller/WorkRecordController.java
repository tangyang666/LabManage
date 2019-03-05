package com.xbn.controller;


import com.xbn.pojo.WorkRecordInfo;
import com.xbn.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/work")
public class WorkRecordController extends BaseController{
    @Autowired
   private WorkService workService;
    @RequestMapping(value = "work.do", method = RequestMethod.POST)
    public void Record(HttpServletRequest req, HttpServletResponse resp){
        WorkRecordInfo workRecordInfo=new WorkRecordInfo();
        String userName = req.getParameter("username");
        String workrecordName = req.getParameter("workrecordname");
        String workrecordContent = req.getParameter("workrecordcontent");
        String workrecordTime = req.getParameter("workrecordtime");
        workRecordInfo.setUserName(userName);
        workRecordInfo.setWorkrecordContent(workrecordContent);
        workRecordInfo.setWorkrecordName(workrecordName);
        workRecordInfo.setWorkrecordTime(workrecordTime);
        System.out.println(workRecordInfo);
        int result=workService.addRecord(workRecordInfo);
        if (result==0) {
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
    public void search(HttpServletRequest req, HttpServletResponse resp){
        List<WorkRecordInfo> list=workService.selWork();
        if (list!=null) {
            Map map = new HashMap();
            map.put("message","添加成功");
            map.put("code","0");
            map.put("list",list);
            resolveJsonReturn(resp, map);
        } else {
            Map map = new HashMap();
            map.put("message","添加失败，请重新添加");
            map.put("code","1");
            resolveJsonReturn(resp, map);
        }
    }


}
