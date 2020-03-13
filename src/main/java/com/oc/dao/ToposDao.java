package com.oc.dao;

import com.oc.model.Topos;

import java.util.List;

public interface ToposDao {
    public void save(Topos topos);
    public List<Topos> list();
}
