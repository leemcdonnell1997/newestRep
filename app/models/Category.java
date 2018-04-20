package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Category extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;
    
    @OneToMany
    private List<Game> games;

    public Category() {
    }

    public Category(Long id, String name, List<Game> games) {
        this.id = id;
        this.name = name;
        this.games = games;
    }

    public Long getCatID() {
        return catID;
    }

    public void setCatID(Long catID) {
        this.catID = catID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Finder<Long,Category> find = new Finder<Long,Category>(Category.class);

    public static List<Category> findAll() {
        return Category.find.query().where("name asc").findList();
    }

        
   
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<>(); 

        for(Category c: Category.findAll()){
            options.put(c.getId().toString(), c.getName());

        }
   return options;

    }




}
