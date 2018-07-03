/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author HOME
 */
public class UseMe {

    
    public static void main(String[] args) {
        Configuration c=new Configuration();
        c.configure();
        SessionFactory buildSessionFactory = c.buildSessionFactory();
        Session openSession = buildSessionFactory.openSession();
        Product p=(Product)openSession.load(Product.class, 007);
        System.out.println(p.getId());
         Product p2=(Product)openSession.load(Product.class, 007);
       /* System.out.println(p2.getId());*/
        System.out.println(p2.getName());
        openSession.close(); 
     /*   Session openSession1 = buildSessionFactory.openSession();
        Product p1=(Product)openSession.get(Product.class, 007);
        System.out.println(p1.getId());
        System.out.println(p1.getName());*/
        
    }
    
}
