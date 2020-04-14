package com.cxq.test; /**
 * @Author: cxq
 * @Date: 2020/1/3 16:16
 */
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author: cxq
 * @Date: 2020/1/3 16:16
 */
public class CXQBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
