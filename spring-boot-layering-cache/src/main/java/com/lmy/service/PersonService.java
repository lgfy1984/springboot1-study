package com.lmy.service;

import com.lmy.entity.Person;


public interface PersonService {
    Person save(Person person);

    void remove(Long id);

    void removeAll();

    Person findOne(Person person);

    Person findOne1(Person person);
}
