package com.lmy.init.destory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * 测试 BeanFactoryAware
 *
 * @author yuhao.wang3
 */
@Component
public class BeanFactoryAwareTestBean implements BeanFactoryAware {
    BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}