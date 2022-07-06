package com.discovery.server.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Huws
 * @version v1.0
 * @ClassName UserMapperImpl
 * @Description
 * @date 2022/6/30 21:11
 **/
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Repository
public class UserMapperImpl implements UserMapper {
    public UserMapperImpl() {
        System.out.println("------------无参初始化--------");
    }

    public UserMapperImpl(String key) {
        System.out.println("------------有参初始化--------" + key);
    }
}
