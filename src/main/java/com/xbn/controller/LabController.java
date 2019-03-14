package com.xbn.controller;

import com.xbn.pojo.PageInfo;
import com.xbn.pojo.UserInfoPojo;
import com.xbn.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/lab")
public class LabController extends BaseController{

    @Autowired
    private LabService labService;
    @RequestMapping(value = "test.do", method = RequestMethod.POST)
    public void test(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("hhhhhh~~~~");
        UserInfoPojo userInfoPojo = new UserInfoPojo();
        userInfoPojo.setPassword("test");
        userInfoPojo.setUsername("test");
        UserInfoPojo user = labService.queryUserAndPassword(userInfoPojo);
        resolveJsonReturn(resp, user);
    }
    @RequestMapping(value = "search.do", method = RequestMethod.POST)
    public void search(HttpServletRequest req, HttpServletResponse resp) {
        String userid= req.getParameter("userid");
        String pageNumber=req.getParameter("pageNumber");
        PageInfo pageInfo=labService.queryUser(pageNumber,userid);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("pageinfo",pageInfo);
        resolveJsonReturn(resp, map);
    }

    @RequestMapping(value = "delete.do", method = RequestMethod.POST)
    public void delete(HttpServletRequest req, HttpServletResponse resp) {
        String userId=req.getParameter("userid");
        labService.delStudent(userId);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("message","删除成功");
        resolveJsonReturn(resp, map);
    }
    @RequestMapping(value = "add.do", method = RequestMethod.POST)
    public void add(HttpServletRequest req, HttpServletResponse resp) {
        UserInfoPojo user = new UserInfoPojo();
        String usertype = req.getParameter("usertype");
        String email = req.getParameter("email");
        String mobile = req.getParameter("phone");
        String name = req.getParameter("name");
        String userid = req.getParameter("userids");
        String leaderusername = req.getParameter("teacher");
        int labid = Integer.parseInt(req.getParameter("labid"));
        user.setUsername(userid);
        user.setPassword(userid);
        user.setEmail(email);
        user.setLabId(labid);
        user.setLeaderUsername(leaderusername);
        user.setMobile(mobile);
        user.setName(name);
        user.setUserId(userid);
        user.setUserType(usertype);
        if (labService.isNewUser(user) ==0) {
            labService.addUser(user);
            Map map = new HashMap();
            map.put("message","学生添加成功");
            map.put("code","0");
            resolveJsonReturn(resp, map);
        } else {
            Map map = new HashMap();
            map.put("message","该学生已注册,请登录或者注册新用户");
            map.put("code","1");
            resolveJsonReturn(resp, map);
        }
    }

    @RequestMapping(value = "change.do", method = RequestMethod.POST)
    public void change(HttpServletRequest req, HttpServletResponse resp) {
        String userid= req.getParameter("userid");
        System.out.println(userid);
        labService.upStudent(userid);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("message","审核成功！");
        resolveJsonReturn(resp, map);
    }



}
