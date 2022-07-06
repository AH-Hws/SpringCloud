package com.shiro;

import com.shiro.realms.CustomerRealm;
import com.shiro.realms.CustomerRealm1;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AbstractAuthenticator;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationListener;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Huws
 * @version v1.0
 * @ClassName ShiroTest
 * @Description
 * @date 2022/6/28 22:04
 **/
public class ShiroTest {

    static Logger logger = LoggerFactory.getLogger(ShiroTest.class);

    /**
     * 身份验证
     */
    @Test
    public void testShiroAuthentication() {
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        // IniRealm iniRealm = new IniRealm("classpath:shiro.ini");
        Realm customerRealm = new CustomerRealm();
        Realm customerRealm1 = new CustomerRealm1();
        List<Realm> realmList = Arrays.asList(customerRealm, customerRealm1);
        securityManager.setRealms(realmList);
        AbstractAuthenticator abstractAuthenticator = (AbstractAuthenticator) securityManager.getAuthenticator();

        Collection<AuthenticationListener> collection = new ArrayList<AuthenticationListener>();
        collection.add(new ShiroAuthenticationListener());
        abstractAuthenticator.setAuthenticationListeners(collection);

        SecurityUtils.setSecurityManager(securityManager);

        //得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
        logger.info("身份验证状态：{}", subject.isAuthenticated());
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
        try {
            //4、登录，即身份验证
            subject.login(token);
        } catch (AuthenticationException e) {
            //5、身份验证失败
        }

        //断言用户已经登录
        logger.info("身份验证状态：{}", subject.isAuthenticated());
        logger.info("是否拥有seller,hr:{}", String.valueOf(subject.hasAllRoles(Arrays.asList("seller", "hr"))));
        boolean[] booleans = subject.hasRoles(Arrays.asList("seller", "hr"));
        System.out.println(booleans[0] + "  " + booleans[1]);
        logger.info("是否拥有权限{}", String.valueOf(subject.isPermitted("customer-list")));
        subject.checkPermission("customer-list");
        //6、退出
        subject.logout();
    }
}
