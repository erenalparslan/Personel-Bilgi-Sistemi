/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.DBConnection;
import java.sql.Connection;
import java.sql.Statement;
import entity.Category;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO extends DBConnection{

    private Connection db;

    public void createCategory(Category c) {

        try {

            Statement st = this.getDb().createStatement();
            String query = "insert into category (title,created) values ('"+c.getTitle()+ "','" + c.getCreated()+"')";
            int r=st.executeUpdate(query);
          

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
        public void delete(Category c) {

        try {

            Statement st = this.getDb().createStatement();
            String query = "delete from category where id="+c.getId();
            int r=st.executeUpdate(query);
          

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    } 

    public List<Category> getCategoryList() {

        List<Category> categoryList = new ArrayList<>();
        try {

            Statement st = this.getDb().createStatement();

            String query = "select* from category";
            ResultSet rs = st.executeQuery(query);        //veri çekme işlemi

            while (rs.next()) {                                //yazdırma için döngü gerekli

                categoryList.add(new Category(rs.getLong("id"), rs.getString("title"), rs.getTimestamp("created"), rs.getTimestamp("updated")));
               
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return categoryList;
    }

    public Connection getDb() {

        if (this.db == null) {
            this.db = this.connect();
        }
        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }

}
