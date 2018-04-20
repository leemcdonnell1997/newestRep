package models;


import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Game extends Model {

@Id

@Constraints.Required
private Long id;
@Constraints.Required
private String name;
@Constraints.Required
private String age;
@Constraints.Required
private String description;
@ManyToOne
private Category category;



public Game(){

}


public Game(Long id, String name, String age, String description){
    this.id = id;
    this.name = name;
    this.age = age;
    this.description = description;
}


public static Finder<Long,Game> find = new Finder<Long,Game>(Game.class);

    public static List<Game> findAll() {
        return Game.find.all();
}



}