
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Log in")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""

"""),format.raw/*7.1*/("""<div class="cole-xs-4">
    <h3>Sign In!</h3>

    """),_display_(/*10.6*/if(loginForm.hasGlobalErrors)/*10.35*/{_display_(Seq[Any](format.raw/*10.36*/("""
        """),format.raw/*11.9*/("""<p class="alert alert-warning">
            """),_display_(/*12.14*/loginForm/*12.23*/.hasGlobalError.message),format.raw/*12.46*/("""
        """),format.raw/*13.9*/("""</p>
    """)))}),format.raw/*14.6*/("""

    """),_display_(/*16.6*/if(flash.containsKey("error"))/*16.36*/ {_display_(Seq[Any](format.raw/*16.38*/("""
        """),format.raw/*17.9*/("""<p class="alert alert-warning">
            """),_display_(/*18.14*/flash/*18.19*/.get("loginRequired")),format.raw/*18.40*/("""
        """),format.raw/*19.9*/("""</p>
    """)))}),format.raw/*20.6*/("""


                """),format.raw/*23.17*/("""<!--Login Form -->
                """),_display_(/*24.18*/helper/*24.24*/.form(action = controller.routes.LoginController.loginSubmit())/*24.87*/ {_display_(Seq[Any](format.raw/*24.89*/("""
                    """),format.raw/*25.49*/("""

                    """),format.raw/*27.66*/("""

                    """),_display_(/*29.22*/CSRF/*29.26*/.formField),format.raw/*29.36*/("""


                    """),format.raw/*32.21*/("""<div class="form-group">
                        """),_display_(/*33.26*/inputText(loginForm("email"), '_label -> "",
                        'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*34.84*/("""
                    """),format.raw/*35.21*/("""</div>

                    <div class="form-group">
                        """),_display_(/*38.26*/inputPassword(loginForm("password"), '_label -> ""
                        'class -> "form-control input-xs", 'placeholder -> "password")),format.raw/*39.87*/("""
                    """),format.raw/*40.21*/("""</div>

                    <div class="form-group">
                        <input type="submit" value="Sign In" class="btn btn-primary">

                    </div>
                """)))}),format.raw/*46.18*/("""
"""),format.raw/*47.1*/("""</div>






            </div>




































































""")))}))
      }
    }
  }

  def render(loginForm:Form[models.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 12:47:10 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/login.scala.html
                  HASH: 65f71851de38500f0ffb4b63cbca4c8b0d404b0e
                  MATRIX: 978->1|1107->59|1151->75|1179->78|1201->92|1240->94|1268->96|1346->148|1384->177|1423->178|1459->187|1531->232|1549->241|1593->264|1629->273|1669->283|1702->290|1741->320|1781->322|1817->331|1889->376|1903->381|1945->402|1981->411|2021->421|2068->440|2131->476|2146->482|2218->545|2258->547|2307->596|2357->663|2407->686|2420->690|2451->700|2502->723|2579->773|2728->901|2777->922|2882->1000|3040->1137|3089->1158|3304->1342|3332->1343
                  LINES: 28->1|31->2|34->3|36->5|36->5|36->5|38->7|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|45->14|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|54->23|55->24|55->24|55->24|55->24|56->25|58->27|60->29|60->29|60->29|63->32|64->33|65->34|66->35|69->38|70->39|71->40|77->46|78->47
                  -- GENERATED --
              */
          