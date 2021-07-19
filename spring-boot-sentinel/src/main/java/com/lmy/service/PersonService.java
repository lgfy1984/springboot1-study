package com.lmy.service;

import com.lmy.entity.Result;

public interface PersonService {

    Result semaphore(String arg);

    Result thread(String arg);
}
