package com.bantanger.demo.design.agent;

import com.bantanger.demo.design.IUserDao;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description
 * @Date 2022/10/6 19:23
 */
class RegisterBeanFactoryTest {

    private Logger logger = LoggerFactory.getLogger(MapperFactoryBean.class);

    @Test
    public void test_IUserDao() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao userDao = beanFactory.getBean("userDao", IUserDao.class);
        String res = userDao.queryUserInfo("100001");
        logger.info("测试结果：{}", res);
    }

}