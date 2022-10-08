package com.bantanger.demo.design.agent;

import com.bantanger.demo.design.IUserDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author bantanger 半糖
 * @version 1.0
 * @Description 将Bean 注册到Spring容器中
 * @Date 2022/10/6 19:09
 */
public class RegisterBeanFactory implements BeanDefinitionRegistryPostProcessor {

    /**
     * 将对象交给spring容器管理，可以很方便的获取到代理bean
     *
     * spring中将bean注册的过程
     * @param registry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(MapperFactoryBean.class); // 定义交给spring管理的bean属于哪一个类
        beanDefinition.setScope("singleton"); //
        beanDefinition.getConstructorArgumentValues() // 获取这个bean的构造函数值(mapperInterface)
                .addGenericArgumentValue(IUserDao.class); // 将值传递到接口IUserDao中

        BeanDefinitionHolder definitionHolder =
                new BeanDefinitionHolder(beanDefinition, "userDao");
        BeanDefinitionReaderUtils.registerBeanDefinition(definitionHolder, registry);

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
