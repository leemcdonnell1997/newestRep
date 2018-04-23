
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


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Games", user)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<h1>Gaming Reviews!</h1>

  <p class="lead">Reviews</p>
  <div class="row">
    <div class="col-sm-2">
      <h4>categories</h4>
      <ul class="list-group">
        <a href=""""),_display_(/*11.19*/routes/*11.25*/.HomeController.index(0)),format.raw/*11.49*/("""" class="list-group-item">All categories</a>

"""),_display_(/*13.2*/for(c <- categories) yield /*13.22*/{_display_(Seq[Any](format.raw/*13.23*/("""
  """),format.raw/*14.3*/("""<li class"list-group-item">"""),_display_(/*14.31*/c/*14.32*/.getName),format.raw/*14.40*/("""
    """),format.raw/*15.5*/("""<span class="badge">???</span>
  </li>
""")))}),format.raw/*17.2*/("""
        
      """),format.raw/*19.7*/("""</ul>
    </div>
  </div>


  """),_display_(/*24.4*/if(flash.containsKey("success"))/*24.36*/ {_display_(Seq[Any](format.raw/*24.38*/("""
    """),format.raw/*25.5*/("""<div class="alert alert-success">
    """),_display_(/*26.6*/flash/*26.11*/.get("success")),format.raw/*26.26*/("""
    """),format.raw/*27.5*/("""</div>
    """)))}),format.raw/*28.6*/("""

"""),format.raw/*30.1*/("""<p>
  <a href=""""),_display_(/*31.13*/routes/*31.19*/.HomeController.addGame()),format.raw/*31.44*/("""">
    <button class="btn btn-primary">Add a game</button>
  </a>
</p>

<td>
  <<a href="#???" class="button-xs btn-danger">#
    <span class="glyphicon-pencil"></span>
  </a>
</td>

""")))}),format.raw/*42.2*/("""
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
                  DATE: Mon Apr 23 11:28:56 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/index.scala.html
                  HASH: 52ae56a5536c4003d9a1dab1ce7f2e337995c7ba
                  MATRIX: 999->1|1178->87|1205->89|1232->108|1271->110|1300->113|1504->290|1519->296|1564->320|1637->367|1673->387|1712->388|1742->391|1797->419|1807->420|1836->428|1868->433|1938->473|1981->489|2038->520|2079->552|2119->554|2151->559|2216->598|2230->603|2266->618|2298->623|2340->635|2369->637|2412->653|2427->659|2473->684|2687->868
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|42->11|42->11|42->11|44->13|44->13|44->13|45->14|45->14|45->14|45->14|46->15|48->17|50->19|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|61->30|62->31|62->31|62->31|73->42
                  -- GENERATED --
              */
          