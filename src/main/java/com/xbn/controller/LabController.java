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
@RequestMapping(value="/lab")
public class LabController extends BaseController{

    @Autowired
    private LabService labService;

    @RequestMapping(value = "test.do", method = RequestMethod.GET)
    public void test(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("hhhhhh~~~~");
        UserInfoPojo userInfoPojo = new UserInfoPojo();
        userInfoPojo.setPassword("test");
        userInfoPojo.setUsername("test");
        UserInfoPojo user = labService.queryUserAndPassword(userInfoPojo);
        resolveJsonReturn(resp, user);
    }


}
