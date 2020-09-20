package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
    @GetMapping("/ip")
    public String getIp() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }
    @GetMapping("/user")
    public String getUserIp() throws UnknownHostException {
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return req.getRemoteAddr();

    }
}
