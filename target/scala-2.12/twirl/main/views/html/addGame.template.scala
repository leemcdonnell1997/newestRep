
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
/*1.2*/import models.Game._
/*2.2*/import models.users._

object addGame extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Game],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(gameForm: Form[models.Game], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*7.2*/import helper._


Seq[Any](format.raw/*4.1*/("""


"""),format.raw/*8.1*/("""
"""),_display_(/*9.2*/main("Add Game", user)/*9.24*/{_display_(Seq[Any](format.raw/*9.25*/("""
"""),format.raw/*10.1*/("""<p class="lead">Add new Game</p>

"""),_display_(/*12.2*/form(action=routes.HomeController.addGameSubmit())/*12.52*/{_display_(Seq[Any](format.raw/*12.53*/(""" 
"""),_display_(/*13.2*/CSRF/*13.6*/.formField),format.raw/*13.16*/(""" 
"""),_display_(/*14.2*/inputText(gameForm("name"), '_label -> "name", 'class-> "form-control")),format.raw/*14.73*/(""" 
"""),_display_(/*15.2*/inputText(gameForm("age"), '_label -> "age", 'class -> "form-control")),format.raw/*15.72*/(""" 
"""),_display_(/*16.2*/inputText(gameForm("description"),'_label -> "description", 'class -> "form-control")),format.raw/*16.87*/(""" 
"""),_display_(/*17.2*/select( gameForm("category.id"), 
options(Category.options), '_label-> "Category", '_default -> "-- Choose a category --", 
'_showConstraints -> false, 'class -> "form-control" )),format.raw/*19.55*/(""" 


"""),_display_(/*22.2*/inputText(gameForm("id"),'_label -> "", 'hidden -> "hidden")),format.raw/*22.62*/(""" """)))}),format.raw/*22.64*/("""

"""),format.raw/*24.1*/("""<div class="actions">

    <input type="submit" value="add GAME" class="btn btn-primary">
    <a href=""""),_display_(/*27.15*/routes/*27.21*/.HomeController.index(0)),format.raw/*27.45*/("""">
        <button type="button" class="btn btn-warning">Cancel</button>


    </a>
</div>















""")))}))
      }
    }
  }

  def render(gameForm:Form[models.Game],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(gameForm,user)

  def f:((Form[models.Game],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (gameForm,user) => apply(gameForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 11:28:56 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/addGame.scala.html
                  HASH: b98b60cfb46eab3aad67af1cc8747fa482027a02
                  MATRIX: 651->1|679->24|1036->48|1163->107|1207->103|1236->124|1263->126|1293->148|1331->149|1359->150|1420->185|1479->235|1518->236|1547->239|1559->243|1590->253|1619->256|1711->327|1740->330|1831->400|1860->403|1966->488|1995->491|2194->669|2225->674|2306->734|2339->736|2368->738|2499->842|2514->848|2559->872
                  LINES: 24->1|25->2|30->3|33->7|36->4|39->8|40->9|40->9|40->9|41->10|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|50->19|53->22|53->22|53->22|55->24|58->27|58->27|58->27
                  -- GENERATED --
              */
          