package org.example.dto;

import org.example.HibernateSessionFactoryUtil;
import org.example.model.BankCard;
import org.example.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDto {
    public User findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }
    public void save(User user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }
    public void update(User user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }
    public void delete(User user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }
    public void delete(int id){
        User user = findById(id);
        delete(user);
    }
    public BankCard findBankCardById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(BankCard.class, id);
    }
    public List<User> findAll(){
       // List<User> users = (List<User>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From  User").list();
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("SELECT a FROM User a", User.class).getResultList();
    }
}
