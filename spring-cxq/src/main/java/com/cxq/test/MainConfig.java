package com.cxq.test; /**
 * @Author: cxq
 * @Date: 2020/4/10 14:21
 */

import com.cxq.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: cxq
 * @Date: 2020/4/10 14:21
 */
@Configuration
@ComponentScan(basePackages = "com.cxq.test")
public class MainConfig {
	@Bean("user")
	public User user(){
		User user = new User();
		user.setName("张三");
		user.setSex("男");
		user.setAge(22);
		return user;
	}
}
