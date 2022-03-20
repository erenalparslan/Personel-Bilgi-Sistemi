
package entity;



import java.sql.Timestamp;


public class Category {
    
    private Long id;
    private String title;
    private Timestamp created;
    private Timestamp updated;

    public Category() {
    }

    public Category(Long id, String title, Timestamp created, Timestamp updated) {
        this.id = id;
        this.title = title;
        this.created = created;
        this.updated = updated;
    }

    public Category( String title, Timestamp created) {
       
        this.title = title;
        this.created = created;
    }

    

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Timestamp getCreated() {
        return created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", title=" + title + ", created=" + created + ", updated=" + updated + '}';
    }

}