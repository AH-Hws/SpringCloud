package com.test.logging;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Huws
 * @version v1.0
 * @ClassName jul
 * @Description
 * @date 2022/6/14 16:57
 **/
public class jul {


    /**
     * jul 日志框架
     */
    @Test
    public void testJul() {
        // 1.创建日志记录器对象
        Logger logger = Logger.getLogger("com.test.logging.jul");
         // 2.日志记录输出
        logger.info("hello jul");
        logger.log(Level.INFO, "info msg");
        String name = "jack";
        Integer age = 18;
        logger.log(Level.INFO, "用户信息：{0},{1}", new Object[]{name, age});
    }
}
