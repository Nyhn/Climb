package com.oc.dao;

import com.oc.model.Topos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ToposDaoImpl  implements ToposDao{
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory;}


    @Override
    public void save(Topos topos) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(topos);
        tx.commit();
        session.close();
    }

    @Override
    public List<Topos> list() {
        Session session = this.sessionFactory.openSession();
        List<Topos> toposList = session.createQuery("FROM  Topos ").list();
        session.close();
        return toposList;
    }
}
