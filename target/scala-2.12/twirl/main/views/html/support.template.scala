
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

object support extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
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
<link href="style.css" rel="stylesheet">
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
  <li><a href="support.scala.html"class='active-page'>Support</a></li>
  <li><a href="reviews.scala.html">Reviews</a></li>
  <li><a href="news.scala.html">News</a></li>
  <li><a href="videos.scala.html">Videos</a></li>
    </ul>

  <h1> Support Page </h1>  
  <h2>Need a hand? Let us know!</h2>
     
  """)))}),format.raw/*42.4*/("""











    """),format.raw/*54.5*/("""</body>

  <footer>
    <p>Second Year Project:
    Alan Kelly Anthony Koleoso
    </a></p>
  </footer>

     
     						
							"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 11:28:56 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/support.scala.html
                  HASH: 36cb7e9ca23bf4ba4053e367385bdd1af21ad7f6
                  MATRIX: 961->1|1081->26|1109->29|1136->48|1174->49|1202->51|2288->1107|2343->1135
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|74->42|86->54
                  -- GENERATED --
              */
          