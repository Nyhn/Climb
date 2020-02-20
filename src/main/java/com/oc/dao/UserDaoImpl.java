package com.oc.dao;

import com.oc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class UserDaoImpl implements UserDao{
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(User user){
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(user);
        tx.commit();
        session.close();
    }
//    @Override
//    public void add(User user) throws DaoException {
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        try {
//            connection = daoFactory.getConnection();
//            preparedStatement = connection.prepareStatement("INSERT INTO customers(pseudo, password, name, firstname, sex, address, zip, mail, phone) VALUES (?,?,?,?,?,?,?,?,?)");
//
//            preparedStatement.setString(1,user.getPseudo());
//            preparedStatement.setString(2,user.getPassword());
//            preparedStatement.setString(3,user.getName());
//            preparedStatement.setString(4,user.getFirstname());
//            preparedStatement.setBoolean(5,user.isSex());
//            preparedStatement.setString(6,user.getAddress());
//            preparedStatement.setInt(7,user.getZip());
//            preparedStatement.setString(8,user.getMail());
//            preparedStatement.setInt(9,user.getPhone());
//
//            preparedStatement.executeUpdate();
//            connection.commit();
//        } catch (SQLException e) {
//            try{
//                if(connection != null)
//                    connection.rollback();
//            }catch (SQLException e1){}
//            throw new DaoException("Impossible de communiquer avec la base de données");
//        }finally {
//            try {
//                if (connection != null)
//                    connection.close();
//            }catch (SQLException e){
//                throw new DaoException("impossible de communiquer avec la base de données");
//            }
//        }
//    }


    @Override
    public List<User> list() {
        Session session = this.sessionFactory.openSession();
        List<User> userList = session.createQuery("from User ").list();
        session.close();
        return userList;
    }
}
