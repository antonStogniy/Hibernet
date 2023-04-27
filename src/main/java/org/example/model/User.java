package org.example.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    public User() {
    }

    public User(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
        bankCards = new ArrayList<>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastname;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BankCard> bankCards;

    public void addBankCard(BankCard bankCard){
        bankCards.add(bankCard);
    }
    public void removeBankCard(BankCard bankCard){
        bankCards.remove(bankCard);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<BankCard> getBankCards() {
        return bankCards;
    }

    public void setBankCards(List<BankCard> bankCards) {
        this.bankCards = bankCards;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
