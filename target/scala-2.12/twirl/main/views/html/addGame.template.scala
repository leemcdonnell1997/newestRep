
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

object addGame extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Game],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(gameForm: Form[models.Game]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Game")/*5.18*/{_display_(Seq[Any](format.raw/*5.19*/("""
    """),format.raw/*6.5*/("""<p class="lead">Addd new Game</p>

"""),_display_(/*8.2*/form(action=routes.HomeController.addGameSubmit(), 'class -> "form-horizontal", 'role -> "form")),format.raw/*8.98*/("""
"""),_display_(/*9.2*/CSRF/*9.6*/.formField),format.raw/*9.16*/("""




"""),_display_(/*14.2*/inputText(gameForm("name"), '_label -> "name", 'class -> "form-control")),format.raw/*14.74*/("""
"""),_display_(/*15.2*/inputText(gameForm("age"), '_label -> "age", 'class -> "form-control")),format.raw/*15.72*/("""
"""),_display_(/*16.2*/inputText(gameForm("description"), '_label -> "description", 'class -> "form-control")),format.raw/*16.88*/("""
"""),_display_(/*17.2*/select(
    gameForm("category.id"),
    options(Category.options),
    '_label -> "Category", '_default -> "-- Choose a category --",
    '_showConstraints -> false, 'class -. "form-control"
)),format.raw/*22.2*/("""


"""),_display_(/*25.2*/inputText(gameForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*25.63*/("""


"""),format.raw/*28.1*/("""<div class="actions">

    <input type="submit" value="add GAME" class="btn btn-primary">
<a href=""""),_display_(/*31.11*/routes/*31.17*/.HomeController.index),format.raw/*31.38*/("""">
    <button type="button" class="btn btn-warning">Cancel</button>


</a>
</div>















""")))}))
      }
    }
  }

  def render(gameForm:Form[models.Game]): play.twirl.api.HtmlFormat.Appendable = apply(gameForm)

  def f:((Form[models.Game]) => play.twirl.api.HtmlFormat.Appendable) = (gameForm) => apply(gameForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 12:47:10 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/addGame.scala.html
                  HASH: d11ce3f907d048a3c56c93720ee687fda447aedd
                  MATRIX: 961->1|1063->33|1107->31|1134->49|1161->51|1185->67|1223->68|1254->73|1315->109|1431->205|1458->207|1469->211|1499->221|1531->227|1624->299|1652->301|1743->371|1771->373|1878->459|1906->461|2119->654|2149->658|2231->719|2261->722|2388->822|2403->828|2445->849
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|39->8|40->9|40->9|40->9|45->14|45->14|46->15|46->15|47->16|47->16|48->17|53->22|56->25|56->25|59->28|62->31|62->31|62->31
                  -- GENERATED --
              */
          