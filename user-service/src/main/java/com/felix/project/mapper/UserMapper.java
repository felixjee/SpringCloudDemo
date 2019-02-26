package com.felix.project.mapper;

import com.felix.project.model.User;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.spring.annotation.MapperScan;

public interface UserMapper extends BaseMapper<User> {
}
