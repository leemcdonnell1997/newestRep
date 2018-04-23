
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
                        <a href=""""),_display_(/*39.35*/routes/*39.41*/.HomeController.index(0)),format.raw/*39.65*/("""">Games</a>
                    </li>
      <li><a href="/signUp"> Sign in/Sign up</a></li>     
      <li><a href="/support">Support</a></li>
      <li><a href="/reviews">Reviews</a></li>
      <li><a href="/news">News</a></li>
      <li><a href="/videos">Videos</a></li>
      <li  """),_display_(/*46.13*/if(title=="Login")/*46.31*/{_display_(Seq[Any](format.raw/*46.32*/("""class="active"""")))}),format.raw/*46.47*/(""">
     <a href=""""),_display_(/*47.16*/routes/*47.22*/.LoginController.login()),format.raw/*47.46*/("""">Login</a>
                   </li>
                   </ul>
                             
                         </div>
                     </nav>
<!-- Login / Logout -->
<li class="nav-item">
        <li """),_display_(/*55.14*/if(title == "Login")/*55.34*/ {_display_(Seq[Any](format.raw/*55.36*/("""class =="active"""")))}),format.raw/*55.53*/(""">
        """),_display_(/*56.10*/if(user !=null)/*56.25*/{_display_(Seq[Any](format.raw/*56.26*/("""
      """),format.raw/*57.7*/("""<a href=""""),_display_(/*57.17*/routes/*57.23*/.LoginController.logout()),format.raw/*57.48*/("""">Logout ???</a>
        """)))}/*58.11*/else/*58.16*/{_display_(Seq[Any](format.raw/*58.17*/("""
          """),format.raw/*59.11*/("""<a class="nav-link" href=""""),_display_(/*59.38*/routes/*59.44*/.LoginController.login()),format.raw/*59.68*/("""">Login</a>
        """)))}),format.raw/*60.10*/("""
    """),format.raw/*61.5*/("""</li>
  </ul> <!-- End of Nav list-->
     
 
      
    

     
      </ul>
      <h1> Tallaght Gaming News </h1>  
      <h2> For All Things Gaming </h2>	
        <style type="text/css">
            body """),format.raw/*73.18*/("""{"""),format.raw/*73.19*/("""background:#1f1c21 !important """),format.raw/*73.49*/("""}"""),format.raw/*73.50*/("""               
             """),format.raw/*74.14*/("""</style> 
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
            """)))}),format.raw/*124.14*/("""  """))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 11:30:48 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/main.scala.html
                  HASH: 27222775cb03b269fd35ac059161f014aae2556b
                  MATRIX: 1224->260|1373->316|1400->318|1427->337|1466->339|1501->347|2382->1201|2416->1214|2833->1604|2862->1624|2901->1625|2947->1640|3010->1676|3025->1682|3070->1706|3382->1991|3409->2009|3448->2010|3494->2025|3538->2042|3553->2048|3598->2072|3836->2283|3865->2303|3905->2305|3953->2322|3991->2333|4015->2348|4054->2349|4088->2356|4125->2366|4140->2372|4186->2397|4231->2424|4244->2429|4283->2430|4322->2441|4376->2468|4391->2474|4436->2498|4488->2519|4520->2524|4754->2730|4783->2731|4841->2761|4870->2762|4927->2791|7194->5026
                  LINES: 33->7|38->8|39->9|39->9|39->9|41->11|54->24|54->24|68->38|68->38|68->38|68->38|69->39|69->39|69->39|76->46|76->46|76->46|76->46|77->47|77->47|77->47|85->55|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|87->57|88->58|88->58|88->58|89->59|89->59|89->59|89->59|90->60|91->61|103->73|103->73|103->73|103->73|104->74|154->124
                  -- GENERATED --
              */
          