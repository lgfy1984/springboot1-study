package com.lmy.transaction.service;


import com.lmy.transaction.entity.Person;

import java.util.List;

/**
 * @author yuhao.wang3
 */
public interface PersonService {

    void insert(Person person);

    List<Person> findAll();
}
