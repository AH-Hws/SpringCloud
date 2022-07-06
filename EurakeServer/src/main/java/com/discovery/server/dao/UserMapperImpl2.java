package com.discovery.server.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author Huws
 * @version v1.0
 * @ClassName UserMapperImpl
 * @Description
 * @date 2022/6/30 21:11
 **/
@Repository
public class UserMapperImpl2 {
    public UserMapperImpl2() {
        System.out.println("------------无参初始化--------");
    }

    public UserMapperImpl2(String key) {
        System.out.println("------------有参初始化--------" + key);
    }
}
