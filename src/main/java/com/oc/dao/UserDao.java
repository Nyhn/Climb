package com.oc.dao;

import com.oc.model.User;

import java.util.List;

public interface UserDao {
    public void save(User user);
    public List<User> list();
}
