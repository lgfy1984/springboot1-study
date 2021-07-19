package com.lmy;

import com.lmy.service.RetryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootStudentSpringRetryApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(SpringBootStudentSpringRetryApplicationTests.class);
    @Autowired
    private RetryService retryService;

    @Test
    public void testRetrying() {
        retryService.retry();
    }

}
