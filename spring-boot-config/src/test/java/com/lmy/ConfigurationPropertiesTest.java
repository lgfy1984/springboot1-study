package com.lmy;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lmy.config.AuthorSettings;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
public class ConfigurationPropertiesTest extends SpringBootStudentConfigApplicationTests {

	@Autowired
	AuthorSettings authorSettings; 
	
	@Test
	public void contextTest() {
		System.out.println(authorSettings.toString());
	}

}
