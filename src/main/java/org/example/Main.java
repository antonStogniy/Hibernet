package org.example;

import org.example.model.BankCard;
import org.example.model.User;
import org.example.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws SQLException {

//
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//
//        UserService userService = new UserService();
//        User user = new User("Antony", "Hopkins");
//        User user1 = new User("Ruslan", "Popesku");
//        User user2 = new User("Test", "Test");
//        userService.saveUser(user);
//        userService.saveUser(user1);
//        userService.saveUser(user2);
//        BankCard bankCard1 = new BankCard(100, "master");
//        BankCard bankCard2 = new BankCard(200, "visa");
//        BankCard bankCard3 = new BankCard(300, "visa");
//        user.addBankCard(bankCard1);
//        bankCard1.setUser(user);
//        user1.addBankCard(bankCard2);
//        user1.addBankCard(bankCard3);
//        bankCard3.setUser(user1);
//        bankCard2.setUser(user1);
//        //bankCard2.setUser(user);
//        //user.addBankCard(bankCard2);
//
//
//
//        session.save(bankCard1);
//        session.save(bankCard2);
//        session.save(bankCard3);
//
//        transaction.commit();
//
//        System.out.println(userService.findAllUsers());
//        session.close();
        SpringApplication.run(Main.class, args);

    }
}