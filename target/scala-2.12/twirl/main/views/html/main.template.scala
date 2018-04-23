
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
  
    """),format.raw/*10.5*/("""<!doctype html>
  
    <html>
    <head>
                      <!-- Latest compiled and minified CSS -->
                      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    
    <!-- jQuery library -->
    <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
    
    <!-- Latest compiled JavaScript -->
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link href="main.css" rel="stylesheet">
    <script src="routes.assets"""),_display_(/*23.32*/("script.js")),format.raw/*23.45*/(""""></script>
    
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
                    <li """),_display_(/*37.26*/if(title == "Games")/*37.46*/{_display_(Seq[Any](format.raw/*37.47*/("""class="active"""")))}),format.raw/*37.62*/(""">
                        <a href=""""),_display_(/*38.35*/routes/*38.41*/.HomeController.index(0)),format.raw/*38.65*/("""">Games</a>
                    </li>
      <li><a href="/signUp"> Sign in/Sign up</a></li>     
      <li><a href="/support">Support</a></li>
      <li><a href="/reviews">Reviews</a></li>
      <li><a href="/news">News</a></li>
      <li><a href="/videos">Videos</a></li>
      <li  """),_display_(/*45.13*/if(title=="Login")/*45.31*/{_display_(Seq[Any](format.raw/*45.32*/("""class="active"""")))}),format.raw/*45.47*/(""">
     <a href=""""),_display_(/*46.16*/routes/*46.22*/.LoginController.login()),format.raw/*46.46*/("""">Login</a>
                   </li>
                   </ul>
                             
                         </div>
                     </nav>
<!-- Login / Logout -->
<li class="nav-item">
        <li """),_display_(/*54.14*/if(title == "Login")/*54.34*/ {_display_(Seq[Any](format.raw/*54.36*/("""class =="active"""")))}),format.raw/*54.53*/(""">
        """),_display_(/*55.10*/if(user !=null)/*55.25*/{_display_(Seq[Any](format.raw/*55.26*/("""
      """),format.raw/*56.7*/("""<a href=""""),_display_(/*56.17*/routes/*56.23*/.LoginController.logout()),format.raw/*56.48*/("""">Logout</a>
        """)))}/*57.11*/else/*57.16*/{_display_(Seq[Any](format.raw/*57.17*/("""
          """),format.raw/*58.11*/("""<a class="nav-link" href=""""),_display_(/*58.38*/routes/*58.44*/.LoginController.login()),format.raw/*58.68*/("""">Login</a>
        """)))}),format.raw/*59.10*/("""
    """),format.raw/*60.5*/("""</li>
  </ul> <!-- End of Nav list-->
     
 
      
    

     
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
            """))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 13:35:45 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/main.scala.html
                  HASH: ba7d4af7c3286dae719c389fa351eea531045e13
                  MATRIX: 1224->260|1373->316|1408->324|2289->1178|2323->1191|2740->1581|2769->1601|2808->1602|2854->1617|2917->1653|2932->1659|2977->1683|3289->1968|3316->1986|3355->1987|3401->2002|3445->2019|3460->2025|3505->2049|3743->2260|3772->2280|3812->2282|3860->2299|3898->2310|3922->2325|3961->2326|3995->2333|4032->2343|4047->2349|4093->2374|4134->2397|4147->2402|4186->2403|4225->2414|4279->2441|4294->2447|4339->2471|4391->2492|4423->2497|4657->2703|4686->2704|4744->2734|4773->2735|4830->2764
                  LINES: 33->7|38->8|40->10|53->23|53->23|67->37|67->37|67->37|67->37|68->38|68->38|68->38|75->45|75->45|75->45|75->45|76->46|76->46|76->46|84->54|84->54|84->54|84->54|85->55|85->55|85->55|86->56|86->56|86->56|86->56|87->57|87->57|87->57|88->58|88->58|88->58|88->58|89->59|90->60|102->72|102->72|102->72|102->72|103->73
                  -- GENERATED --
              */
          