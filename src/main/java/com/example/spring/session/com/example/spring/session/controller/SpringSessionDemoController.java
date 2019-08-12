package com.example.spring.session.com.example.spring.session.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SpringSessionDemoController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/set")
    public String setDemo(HttpSession httpSession) {
        httpSession.setAttribute("test", "Vincent");
        return String.valueOf(port);
    }

    @GetMapping("/get")
    public String getDemo(HttpSession httpSession) {
        return String.format("%S:%S", httpSession.getAttribute("test"), port);
    }
}
