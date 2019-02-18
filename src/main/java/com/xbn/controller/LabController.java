package com.xbn.controller;

import com.xbn.pojo.UserInfoPojo;
import com.xbn.service.LabService;
import com.xbn.service.impl.LabServiceImpl;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
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
public class LabController {

    @Autowired
    private LabService labService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public void test(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("hhhhhh~~~~");
        List<UserInfoPojo> list = new ArrayList<UserInfoPojo>();

        list = labService.queryUserInfo();

        System.out.println(list.size());
        System.out.println(list.get(0).getUsername());
        PrintWriter pw = null;
        try {
            pw = resp.getWriter();
            pw.write(list.get(0).getUsername());
            pw.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
