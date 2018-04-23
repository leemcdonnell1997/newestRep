
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Game],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Game: List[models.Game], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home PAge", user)/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
  """),format.raw/*3.3*/("""<h1>Gaming Reviews!</h1>

  <p class="lead">Reviews</p>
  <div class="row">
    <div class="col-sm-2">
      <h4>categories</h4>
      <ul class="list-group">
        <a href=""""),_display_(/*10.19*/routes/*10.25*/.HomeController.index(0)),format.raw/*10.49*/("""" class="list-group-item">All categories</a>

"""),_display_(/*12.2*/for(c <- categories) yield /*12.22*/{_display_(Seq[Any](format.raw/*12.23*/("""
  """),format.raw/*13.3*/("""<li class"list-group-item">"""),_display_(/*13.31*/c/*13.32*/.getName),format.raw/*13.40*/("""
    """),format.raw/*14.5*/("""<span class="badge">???</span>
  </li>
""")))}),format.raw/*16.2*/("""
        
      """),format.raw/*18.7*/("""</ul>
    </div>
  </div>


  """),_display_(/*23.4*/if(flash.containsKey("success"))/*23.36*/ {_display_(Seq[Any](format.raw/*23.38*/("""
    """),format.raw/*24.5*/("""<div class="alert alert-success">
    """),_display_(/*25.6*/flash/*25.11*/.get("success")),format.raw/*25.26*/("""
    """),format.raw/*26.5*/("""</div>
    """)))}),format.raw/*27.6*/("""

"""),format.raw/*29.1*/("""<p>
  <a href=""""),_display_(/*30.13*/routes/*30.19*/.HomeController.addGame()),format.raw/*30.44*/("""">
    <button class="btn btn-primary">Add a game</button>
  </a>
</p>

<td>
  <<a href="#???" class="button-xs btn-danger">#
    <span class="glyphicon-pencil"></span>
  </a>
</td>

""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(Game:List[models.Game],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(Game,categories,user)

  def f:((List[models.Game],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (Game,categories,user) => apply(Game,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 13:35:45 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/index.scala.html
                  HASH: 7a2e4b141c47c27ef5e8e0985feccf36d898c78c
                  MATRIX: 999->1|1178->88|1209->111|1248->113|1277->116|1481->293|1496->299|1541->323|1614->370|1650->390|1689->391|1719->394|1774->422|1784->423|1813->431|1845->436|1915->476|1958->492|2015->523|2056->555|2096->557|2128->562|2193->601|2207->606|2243->621|2275->626|2317->638|2346->640|2389->656|2404->662|2450->687|2664->871
                  LINES: 28->1|33->2|33->2|33->2|34->3|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|44->13|45->14|47->16|49->18|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|58->27|60->29|61->30|61->30|61->30|72->41
                  -- GENERATED --
              */
          