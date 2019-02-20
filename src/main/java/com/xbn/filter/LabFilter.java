package com.xbn.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LabFilter extends HandlerInterceptorAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(LabFilter.class);

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        System.out.println("拦截器～～～～");
        HttpServletRequest request = (HttpServletRequest) httpServletRequest;
        HttpServletResponse response = (HttpServletResponse) httpServletResponse;
        String ctxPath = request.getContextPath();
        System.out.println();

        HttpSession session = request.getSession();

        //如果session中的登陆信息为空 跳转到登陆页面
        if(null == session || null == session.getAttribute("loginInfo")) {
            response.sendRedirect(ctxPath + "/login.html");
            return false;
        }
        return true;

    }
}
