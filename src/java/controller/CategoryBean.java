/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.CategoryDAO;
import entity.Category;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 *
 * @author Eren
 */
@Named(value = "categoryBean")
@SessionScoped
public class CategoryBean implements Serializable {

   private Category entity;
   private CategoryDAO dao;
   private List<Category> list;
   
    public CategoryBean() {
    }

   public void create(){
     this.entity.setCreated(new Timestamp(System.currentTimeMillis()));
     this.getDao().createCategory(entity);
     this.entity=new Category();
     
   }
   public void delete(Category c){
       this.getDao().delete(c);
       
       
   }
    
    public Category getEntity() {
        if(entity==null){
            this.entity=new Category();
        }
        return entity;
    }

    /**
     * @param entity the entity to set
     */
    public void setEntity(Category entity) {
        this.entity = entity;
    }

    /**
     * @return the dao
     */
    public CategoryDAO getDao() {
        if(dao==null){
            this.dao=new CategoryDAO();
        }
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(CategoryDAO dao) {
        this.dao = dao;
    }

    /**
     * @return the list
     */
    public List<Category> getList() {
      this.list=this.getDao().getCategoryList();
        
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<Category> list) {
        this.list = list;
    }
    
    
    
}
