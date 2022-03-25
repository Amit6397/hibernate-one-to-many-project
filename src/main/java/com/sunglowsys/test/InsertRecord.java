package com.sunglowsys.test;

import com.sunglowsys.domain.Account;
import com.sunglowsys.domain.Employee;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class InsertRecord {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        System.out.println("started");

        Employee employee = new Employee();
        employee.setFirstName("amit");
        employee.setLasName("kashyap");

        Account account =new Account();
        account.setBank("sbi");

        Account account1 = new Account();
        account1.setBank("hdfc");

        List<Account> list = new ArrayList<>();
        list.add(account);
        list.add(account1);

        employee.setAccount(list);

        session.save(account);
        session.save(account1);
        session.save(employee);

        session.getTransaction().commit();
        session.close();


    }
}
