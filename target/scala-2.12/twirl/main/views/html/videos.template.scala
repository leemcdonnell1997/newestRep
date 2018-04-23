
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object videos extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Game],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Game: List[models.Game], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.52*/("""
"""),_display_(/*2.2*/main("Games", user)/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
"""),format.raw/*3.1*/("""<!doctype html>

<html>
<head>
  	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="main.css" rel="stylesheet">
<script src="script.js"></script>

<meta charset="UTF-8">

<title> TGN </title>
</head>
<body>
	
    <nav>
    <a href="index.html">
            
 
    </a>
    </nav>
 
    <ul>
  <li><a href="signUp.scala.html"> Sign in/Sign up</a></li>     
  <li><a href="support.scala.html">Support</a></li>
  <li><a href="reviews.scala.html">Reviews</a></li>
  <li><a href="news.scala.html">News</a></li>
  <li><a href="videos.scala.html"class='active-page'>Videos</a></li>
    </ul>

  <h1> Videos </h1>  
  <h2>Check out some clips from the latest games!</h2>

  <h3>Far Cry 4 Flying Goat Glitch Encountered</h3>
  <br>

  <iframe width="560" height="315" src="https://www.youtube.com/embed/TeamT1k54Do" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
  
  <h4>This strange glitch is was encountered in Ubisoft's Far Cry 4. Forget "when pigs fly", Now its When goats fly eh..? <h4>
        <style type=text/css>
            h4 """),format.raw/*49.16*/("""{"""),format.raw/*49.17*/("""color: #ffffff; """),format.raw/*49.33*/("""}"""),format.raw/*49.34*/("""
            """),format.raw/*50.13*/("""</style>

    <h3>Youtuber "Aurateur" Beats Unique Super Mario Maker Level </h3>
    <iframe width="560" height="315" src="https://www.youtube.com/embed/FuF4DRKva-c" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>        
      
    <h4>Aurateur is an American Youtuber whos specialises in challenging tough Super Mario Maker Levels. In this video, he takes a shot at a very unique 
        level which involves some sort of mirror aspect. Nonetheless, it makes for an interesting watch!
    </h4>

    <footer>
            <p>Second Year Project:
            Alan Kelly Anthony Koleoso
            </a></p>
          </footer>
     
        """)))}),format.raw/*65.10*/("""  						
							"""))
      }
    }
  }

  def render(Game:List[models.Game],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(Game,user)

  def f:((List[models.Game],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (Game,user) => apply(Game,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 11:28:56 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/videos.scala.html
                  HASH: 685a9ac8f2cce6cd6a4aa9146c51b8210fafceea
                  MATRIX: 978->1|1123->51|1151->54|1178->73|1216->74|1244->76|2724->1528|2753->1529|2797->1545|2826->1546|2868->1560|3585->2246
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|81->49|81->49|81->49|81->49|82->50|97->65
                  -- GENERATED --
              */
          