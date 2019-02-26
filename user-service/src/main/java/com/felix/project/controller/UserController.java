package com.felix.project.controller;

import com.felix.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private UserService userService;
    @GetMapping(value = "/list")
    public Object list(){
        Map<String,Object> map=new HashMap();
        map.put("data",userService.getList());
        map.put("port",port);
        return map;
    }
}
