package com.discovery.server.service;

import com.discovery.server.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Huws
 * @version v1.0
 * @ClassName UserServiceImp
 * @Description
 * @date 2022/6/30 21:10
 **/
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;
}
