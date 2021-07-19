package com.lmy.transaction.service;


import com.lmy.transaction.dao.PersonDao;
import com.lmy.transaction.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author yuhao.wang3
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDao personDao;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(Person person) {
        personDao.insert(person);
    }

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }
}
