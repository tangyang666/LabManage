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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/login")
public class LoginController extends BaseController{

    @Autowired
    private LabService labService;

    @RequestMapping(value = "in.do", method = RequestMethod.POST)
    public void logIn(HttpServletRequest req, HttpServletResponse resp) {
        UserInfoPojo user=new UserInfoPojo();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        user.setUsername(username);
        user.setPassword(password);
        //如果登陆成果 跳转到首页
        UserInfoPojo u=labService.queryUserAndPassword(user);
        System.out.println(u);
        if(labService.queryUserAndPassword(user)!=null&&labService.queryUserAndPassword(user).getVerify().equals("1")) {
            //登陆成功后将用户登陆信息存放到session中去
            String userType=labService.queryUserAndPassword(user).getUserType();
            req.getSession().setAttribute("loginInfo", user);
            Map<String,Object> map = new HashMap<String,Object>();
            System.out.println("00000");
            map.put("message","登录成功");
            map.put("code", "0");
            map.put("usertype",userType);
            resolveJsonReturn(resp, map);

        }
        else{
            Map map = new HashMap();
            if(labService.queryUserAndPassword(user)==null){
            map.put("message","用户名或密码错误");
            map.put("code", "1");
            }
            else{
                map.put("message","用户等待审核");
                map.put("code", "2");
            }
            resolveJsonReturn(resp, map);
        }
    }

    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    public void SignUp(HttpServletRequest req, HttpServletResponse resp) {
        UserInfoPojo user = new UserInfoPojo();
        String username = req.getParameter("usernames");
        String password = req.getParameter("passwords");
        String usertype = req.getParameter("usertype");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String name = req.getParameter("name");
        String userid = req.getParameter("userid");
        String leaderusername = req.getParameter("leaderusername");
        int labid = Integer.parseInt(req.getParameter("labid"));
        if(usertype=="Teacher"){
            user.setVerify("1");
        }else{
            user.setVerify("0");
        }
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setLabId(labid);
        user.setLeaderUsername(leaderusername);
        user.setMobile(mobile);
        user.setName(name);
        user.setUserId(userid);
        user.setUserType(usertype);
        System.out.println(user);
        if (labService.isNewUser(user) ==0) {
            labService.addUser(user);
            Map map = new HashMap();
            map.put("message","注册成功，请登录");
            map.put("code","0");
            resolveJsonReturn(resp, map);
        } else {
            Map map = new HashMap();
            map.put("message","该用户已注册,请登录或者注册新用户");
            map.put("code","1");
            resolveJsonReturn(resp, map);
        }
    }

}
