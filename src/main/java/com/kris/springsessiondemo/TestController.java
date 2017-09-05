package com.kris.springsessiondemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @GetMapping("/set")
    public String set(HttpServletRequest request){
        request.getSession().setAttribute("testKey","testValue");
        return "设置session";
    }

    @GetMapping("/query")
    public String query(HttpServletRequest request){
        Object value = request.getSession().getAttribute("testKey");
        return "查询session:" + value;
    }

    @GetMapping("/remove")
    public String remove(HttpServletRequest request){
        request.getSession().removeAttribute("testKey");
        return "移除";
    }
}
