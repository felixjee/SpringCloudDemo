package com.felix.project.service;

import com.felix.project.mapper.UserMapper;
import com.felix.project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public List<User> getList(){
        return userMapper.selectAll();
    }
}
