package com.xbn.controller;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class BaseController {
    /**
     * 返回JSON
     */
    protected void resolveJsonReturn(HttpServletResponse response, Object obj) {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String jsonStr = JSON.toJSONString(obj);
        PrintWriter pw = null;
        try {
            pw = response.getWriter();
            pw.write(jsonStr);
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
