package com.lmy.service;

import com.lmy.entity.Person;

public interface  PersonService {

    /**
     * 测试事务的传递性
     *
     * @param person
     * @return
     */
//    @Transactional
    Person save(Person person);

    void save2(Person person);

    void delete();

}
