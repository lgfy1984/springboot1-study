package com.lmy;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lmy.config.PropertyConfig;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
public class ValuePropertyConfigTest extends SpringBootStudentConfigApplicationTests {

	@Autowired
	PropertyConfig propertyConfig; 
	
	@Test
	public void contextTest() {
		System.out.println(propertyConfig.toString());
	}

}
