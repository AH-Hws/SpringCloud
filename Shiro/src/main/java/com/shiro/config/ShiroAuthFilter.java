package com.shiro.config;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 */
public class ShiroAuthFilter extends FormAuthenticationFilter {

    public ShiroAuthFilter() {
        super();
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        System.out.println("未登录或登录信息已过期");
        return Boolean.FALSE;
    }

}
