package models.review;

import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import javax.validation.Constraint;


@Entity
public class Review extends Model {


    @Id
    private Long id;
       
    @Constraints.Required
    private String title;

    @Constraints.Required
    private String description;

    @Constraints.Required
    private String Name;


    


    public Review() {
    }

    public Review(Long id, String title, String description, String name) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.Name = name;
    
    }
        public Long getId() {
            return this.id;
        }
    
        public void setId(Long id) {
            this.id = id;
        }
    
        
        public String getTitle() {
            return this.title;
        
        }

        public void setTitle(String title){
            this.title = title;
        }
    
       
    
        public String getDescription() {
            return this.description;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    
    
    
    
    
    
    
    
    
    
    
    
        }

