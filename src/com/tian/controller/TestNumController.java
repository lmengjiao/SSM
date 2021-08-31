package com.tian.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestNumController implements Controller {//注意包名
//controller中有个方法 叫做模型和视图 意思是把视图和模型绑在一起了
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("我是模型和视图");
        System.out.println("注意写的和前端视图名称一样");
        ModelAndView modelAndView = new ModelAndView("Test02");
        return modelAndView;
    }
}
