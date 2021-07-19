package com.lmy.service;

import com.lmy.annotation.Retryable;
import com.lmy.retrylistener.MyRetryListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RetryService {
    @Retryable(exception = Throwable.class, attemptNumber = 3, sleepTime = 100, timeUnit = TimeUnit.MILLISECONDS, retryListener = MyRetryListener.class)
    public Object retry() {
        System.out.println("测试方法重试");

        return null;
    }
}
