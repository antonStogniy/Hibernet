package org.example;

import org.example.model.BankCard;
import org.example.model.User;
import org.example.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");

        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        UserService userService = new UserService();
        User user = new User("Antony", "Hopkins");
        User user1 = new User("Ruslan", "Popesku");
        userService.saveUser(user);
        userService.saveUser(user1);
        BankCard bankCard1 = new BankCard(100, "master");
        BankCard bankCard2 = new BankCard(200, "visa");
        bankCard1.setUser(user);
        user.addBankCard(bankCard1);
        bankCard2.setUser(user);
        user.addBankCard(bankCard2);



        session.save(bankCard1);
        session.save(bankCard2);

        User user5 = session.get(User.class, 1);
        System.out.println(user5);
        transaction.commit();

        session.close();

    }
}