package com.oc.dao;

import com.oc.model.Person;

import java.util.List;

public interface PersonDAO {
    public void save(Person person);
    public List<Person> list();
}
