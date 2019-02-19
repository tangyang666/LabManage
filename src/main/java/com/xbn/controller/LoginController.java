package com.xbn.controller;

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
import java.util.List;

@Controller
@RequestMapping(value="/login")
public class LoginController {

    @Autowired
    private LabService labService;

    @RequestMapping(value = "in.do", method = RequestMethod.POST)
    public String logIn(HttpServletRequest req, HttpServletResponse resp) {
        UserInfoPojo user=new UserInfoPojo();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        user.setUsername(username);
        user.setPassword(password);
        /*System.out.println("username:" + username);
        System.out.println("password:" + password);*/

        //TODO: 登陆校验的逻辑
        UserInfoPojo pojo = labService.queryUserAndPassword(user);

        System.out.println("pojo:" + pojo);


        //如果登陆成果 跳转到首页
        if(labService.queryUserAndPassword(user)!=null)
        return "redirect:/index.html";
        else return "用户名或密码错误";
    }
    /*@RequestMapping(value = "register.do", method = RequestMethod.POST)
    public String SignUp(HttpServletRequest req, HttpServletResponse resp) {
        UserInfoPojo user=new UserInfoPojo();
        String username = req.getParameter("usernames");
        String password = req.getParameter("passwords");
       // String usertype = req.getParameter("usernames");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String name = req.getParameter("name");
        String userid = req.getParameter("userid");
        String leaderusername = req.getParameter("leaderusername");
        String labid = req.getParameter("labid");
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setLabId(labid);
        user.setLeaderUsername(leaderusername);
        user.setMobile(mobile);
        user.setName(name);
        user.setUserId(userid);
        user.setUserType();
        int result=labService.addUser(user);
        *//*if(index==)
            return "redirect:/index.html";
        else
        return "用户创建失败";*//*
    }*/


}
