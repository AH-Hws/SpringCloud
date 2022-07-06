package com.shiro;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationListener;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.PrincipalCollection;

@Slf4j
public class ShiroAuthenticationListener implements AuthenticationListener {

    public void onSuccess(AuthenticationToken token, AuthenticationInfo info) {
       log.info("登陆成功");
    }

    public void onFailure(AuthenticationToken token, AuthenticationException ae) {

    }

    public void onLogout(PrincipalCollection principals) {
        log.info("退出");
    }
}
