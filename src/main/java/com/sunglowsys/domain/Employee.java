package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = true)
    private String firstName;
    @Column(nullable = false)
    private String lasName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Account> account;

    public Employee() {}

    public Employee(String firstName, String lasName, List<Account> account) {
        this.firstName = firstName;
        this.lasName = lasName;
        this.account = account;
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

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' +
                ", account=" + account +
                '}';
    }
}
