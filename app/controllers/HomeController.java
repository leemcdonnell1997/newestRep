package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


    private FormFactory formFactory;
    private Environment env;

    @Inject
    public HomeController(FormFactory f, Environment e) {
        this.formFactory = f;
        this.env = e
    }

    public Result videos() {
        return ok(views.html.videos.render(getCurrentUser()));
    }
    public Result news() {
        return ok(views.html.news.render(gameList, getCurrentUser()));
    }
    public Result support() {
        return ok(views.html.support.render(gameList, getCurrentUser()));
    }

    public Result reviews() {
        return ok(views.html.reviews.render(gameList, getCurrentUser()));
    }


    private User getCurrentUser() {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}


    public Result index(Long cat) {

       
     List<Game> gameList = Game.findAll();

     List <Category> categoryList = Category.findAll();
     if (cat == 0) {
         gameList = Game.findAll();

     }  else {
         categoryList = Category.findAll();
     }

    return ok(index.render(gameList, categoryList, getCurrentUser()));

    }



        public Result addGame(){

            Form<Game> gameForm = formFactory.form(Game.class);
            return ok(addGame.render(gameForm,  getCurrentUser()));

   
        }


        public Result addGameSubmit(){
            Form<Game> newGameForm = formFactory.form(Game.class).bindFromRequest();


            if (newGameForm.hasErrors()){
                
            return badRequest (addGame.render(newGameForm,  getCurrentUser()));
            
        }else {
                Game newGame = newGameForm.get();

                if (newGame.id == null ){
                     
                    newGame.save();
                
                
                } else if (newGame.id != null){
                    newGame.update();
                }
               
               
                flash("Success", "game" +newGame.name + "added");

                return redirect (controllers.routes.HomeController.index(0));
            }
        }
               

                
            
        
        
        @Security.Authenticated(Secured.class)
        @With(AuthAdmin.class)
        @Transactional
        public Result deleteGame(Long id) {
            Game.find.ref(id).delete();

            flash("success", "game has been deleted");

            return redirect(routes.HomeController.index(0));
        }


        @Security.Authenticated(Secured.class)
@Transactional
public Result updateGame(Long id){

    Game g;
    Form<Game> gameForm;

    try{
        g = Game.find.byId(id);

        gameForm = formFactory.form(Game.class).fill(g);
    
    
    } catch (Exception ex) {
        return badRequest("error");

    }
    return ok(addGame.render(gameForm, getCurrentUser()));
 
}
       














}
