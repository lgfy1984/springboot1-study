package com.lmy.service;

import com.lmy.entity.Person;


public interface PersonService {
    Person save(Person person);

    void remove(Long id);

    Person findOne(Person person);
}
