package com.felix.project.service;

import com.felix.project.client.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;
    public Object getList(){
        return eurekaClientFeign.getList();
    }
}
