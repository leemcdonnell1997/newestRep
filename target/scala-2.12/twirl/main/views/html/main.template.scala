
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),_display_(/*9.2*/main("Games", user)/*9.21*/ {_display_(Seq[Any](format.raw/*9.23*/("""
  
    """),format.raw/*11.5*/("""<!doctype html>
  
    <html>
    <head>
                      <!-- Latest compiled and minified CSS -->
                      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    
    <!-- jQuery library -->
    <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
    
    <!-- Latest compiled JavaScript -->
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link href="main.css" rel="stylesheet">
    <script src="routes.assets"""),_display_(/*24.32*/("script.js")),format.raw/*24.45*/(""""></script>
    
    <meta charset="UTF-8">
    <title>TGN</title>
    </head>
    <body>
      
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#"> Online Site</a>
                </div>

                <ul class="nav navbar-nav">
                    <li """),_display_(/*38.26*/if(title == "Games")/*38.46*/{_display_(Seq[Any](format.raw/*38.47*/("""class="active"""")))}),format.raw/*38.62*/(""">
                        <a href=""""),_display_(/*39.35*/routes/*39.41*/.HomeController.index()),format.raw/*39.64*/("""">Games</a>
                    </li>
      <li><a href="/signUp"> Sign in/Sign up</a></li>     
      <li><a href="/support">Support</a></li>
      <li><a href="/reviews">Reviews</a></li>
      <li><a href="/news">News</a></li>
      <li><a href="/videos">Videos</a></li>
      <li  """),_display_(/*46.13*/if),format.raw/*46.15*/(""" """),format.raw/*46.16*/("""(title=="Login")"""),format.raw/*46.32*/("""{"""),format.raw/*46.33*/("""class="active""""),format.raw/*46.47*/("""}"""),format.raw/*46.48*/(""">
          <a href=""""),_display_(/*47.21*/routes/*47.27*/.Login.login()),format.raw/*47.41*/("""">Login</a>
      </li>
      </ul>
                
            </div>
        </nav>
     
<li """),_display_(/*54.6*/if),format.raw/*54.8*/(""" """),format.raw/*54.9*/("""(title == "Login") """),format.raw/*54.28*/("""{"""),format.raw/*54.29*/("""class =="active""""),format.raw/*54.45*/("""}"""),format.raw/*54.46*/(""">
    """),_display_(/*55.6*/if),format.raw/*55.8*/(""" """),format.raw/*55.9*/("""(user !=null)"""),format.raw/*55.22*/("""{"""),format.raw/*55.23*/("""
        """),format.raw/*56.9*/("""<a href=""""),_display_(/*56.19*/routes/*56.25*/.LoginController.logout()),format.raw/*56.50*/("""">Logout """),_display_(/*56.60*/user/*56.64*/.getName()),format.raw/*56.74*/("""</a>
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/(""" """),format.raw/*57.7*/("""else """),format.raw/*57.12*/("""{"""),format.raw/*57.13*/("""
        """),format.raw/*58.9*/("""<a href=""""),_display_(/*58.19*/routes/*58.25*/.LoginController.login()),format.raw/*58.49*/("""">Login</a>
    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/("""
"""),format.raw/*60.1*/("""</li>
  
     
 
      
    

     
      </ul>
      <h1> Tallaght Gaming News </h1>  
      <h2> For All Things Gaming </h2>	
        <style type="text/css">
            body """),format.raw/*72.18*/("""{"""),format.raw/*72.19*/("""background:#1f1c21 !important """),format.raw/*72.49*/("""}"""),format.raw/*72.50*/("""               
             """),format.raw/*73.14*/("""</style> 
        <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div id="my-slider" class="carousel slide" data-ride="carousel">
                           
                           
    
                            <!-- Wrapper For Slides -->
                            <div class="carousel-inner" role="listbox">   
                                <div class ="item active">
                                    <img src="assets/images/farcry5.jpg" alt"far cry 5" />
                                    <div class="carousel-caption">
                                        <h1> Check out Our Review Section!</h1>
                                        </div>
                               </div>
                               <div class ="item">
                                    <img src="assets/images/games.jpg" alt"far cry 5" />
                                    <div class="carousel-caption">
                                        <h1> Check out what's Trending</h1>
                                        </div>
                               </div>
                                </div>    
    
    
                            <!-- Navigation Controls -->
                            <a class="left carousel-control" href="#my-slider" role="button" data-slide="prev">
                                <span class=" glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                            </a>
                            <a class="right carousel-control" href="#my-slider" role="button" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                            </a>
                         
                                                                              
                   
                
                    
    
    
    
                        </div>
                    </div>
                </div>
            </div>
          
            <footer>
                <p>Second Year Project:
                Alan Kelly Anthony Koleoso Lee McDonnell
                </a></p>
              </footer>
            """)))}),format.raw/*123.14*/("""  """))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 12:52:56 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/main.scala.html
                  HASH: ac19ccfa2b78ddc9ee94077af689ef7c8c1f2e80
                  MATRIX: 1224->260|1373->316|1400->318|1427->337|1466->339|1501->347|2382->1201|2416->1214|2833->1604|2862->1624|2901->1625|2947->1640|3010->1676|3025->1682|3069->1705|3381->1990|3404->1992|3433->1993|3477->2009|3506->2010|3548->2024|3577->2025|3626->2047|3641->2053|3676->2067|3800->2165|3822->2167|3850->2168|3897->2187|3926->2188|3970->2204|3999->2205|4032->2212|4054->2214|4082->2215|4123->2228|4152->2229|4188->2238|4225->2248|4240->2254|4286->2279|4323->2289|4336->2293|4367->2303|4403->2312|4431->2313|4459->2314|4492->2319|4521->2320|4557->2329|4594->2339|4609->2345|4654->2369|4697->2385|4725->2386|4753->2387|4958->2564|4987->2565|5045->2595|5074->2596|5131->2625|7398->4860
                  LINES: 33->7|38->8|39->9|39->9|39->9|41->11|54->24|54->24|68->38|68->38|68->38|68->38|69->39|69->39|69->39|76->46|76->46|76->46|76->46|76->46|76->46|76->46|77->47|77->47|77->47|84->54|84->54|84->54|84->54|84->54|84->54|84->54|85->55|85->55|85->55|85->55|85->55|86->56|86->56|86->56|86->56|86->56|86->56|86->56|87->57|87->57|87->57|87->57|87->57|88->58|88->58|88->58|88->58|89->59|89->59|90->60|102->72|102->72|102->72|102->72|103->73|153->123
                  -- GENERATED --
              */
          