/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Eren
 */
public abstract class DBConnection {
    
    public Connection connect(){
         Connection c=null;
         try {
            Class.forName("org.postgresql.Driver");             //driver kütüphanesi eklenmeli
             c =DriverManager.getConnection("jdbc:postgresql://localhost:5432/cms", "postgres", "12345"); //bağlantı için gerekli
             Statement st=c.createStatement();
             
         }
            
     catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    return c;
}
}
