package com.cxq.test; /**
 * @Author: cxq
 * @Date: 2020/4/10 14:25
 */

import com.cxq.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: cxq
 * @Date: 2020/4/10 14:25
 */
public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		User user = (User)context.getBean("user");
		System.out.println("user:  " + user);
	}
}
