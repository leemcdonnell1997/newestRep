
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


Seq[Any](format.raw/*1.58*/(""" 
"""),format.raw/*3.1*/("""


"""),_display_(/*6.2*/main("Login Required", user)/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
"""),format.raw/*7.1*/("""<div class="col-sm-4">
    <h3>Sign in</h3>
    <!-- Display login errors if they exist -->
    """),_display_(/*10.6*/if(loginForm.hasGlobalErrors)/*10.35*/ {_display_(Seq[Any](format.raw/*10.37*/("""
    """),format.raw/*11.5*/("""<p class="alert alert-warning">
        """),_display_(/*12.10*/for(error <- loginForm.globalErrors) yield /*12.46*/ {_display_(Seq[Any](format.raw/*12.48*/("""
        """),format.raw/*13.9*/("""<p>"""),_display_(/*13.13*/error/*13.18*/.format(messages())),format.raw/*13.37*/("""

        """),format.raw/*15.9*/("""</p>
    """)))}),format.raw/*16.6*/("""  """),_display_(/*16.9*/if(flash.containsKey("error"))/*16.39*/ {_display_(Seq[Any](format.raw/*16.41*/("""
    """),format.raw/*17.5*/("""<div class="alert alert-warning">
        """),_display_(/*18.10*/flash/*18.15*/.get("loginRequired")),format.raw/*18.36*/("""
    """),format.raw/*19.5*/("""</div>
    """)))}),format.raw/*20.6*/("""
""")))}),format.raw/*21.2*/("""
    """),format.raw/*22.5*/("""<!-- The login form -->
    """),_display_(/*23.6*/helper/*23.12*/.form(action = routes.LoginController.loginSubmit())/*23.64*/ {_display_(Seq[Any](format.raw/*23.66*/(""" """),_display_(/*23.68*/CSRF/*23.72*/.formField),format.raw/*23.82*/("""
    """),format.raw/*24.5*/("""<div class="form-group">
        <input type="text" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*25.99*/loginForm("email")/*25.117*/.getValue.orElse(" ")),format.raw/*25.138*/("""">
    </div>
    <div class="form-group">
        <input type="password" name="password" class="form-control input-xs" placeholder="Password">
    </div>

    <!-- Add a submit button -->
    <div class="form-group">
        <input type="submit" value="Sign In" class="btn btn-primary">
    </div>
    """)))}),format.raw/*35.6*/("""

"""),format.raw/*37.1*/("""</div>
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
                  DATE: Mon Apr 23 11:28:56 IST 2018
                  SOURCE: /home/wdd/Desktop/play-java-seed/app/views/login.scala.html
                  HASH: ba2868685954bc130a0db11a51a37333934bda8b
                  MATRIX: 978->1|1107->60|1152->57|1180->77|1209->81|1245->109|1284->111|1311->112|1434->209|1472->238|1512->240|1544->245|1612->286|1664->322|1704->324|1740->333|1771->337|1785->342|1825->361|1862->371|1902->381|1931->384|1970->414|2010->416|2042->421|2112->464|2126->469|2168->490|2200->495|2242->507|2274->509|2306->514|2361->543|2376->549|2437->601|2477->603|2506->605|2519->609|2550->619|2582->624|2732->747|2760->765|2803->786|3137->1090|3166->1092
                  LINES: 28->1|31->2|34->1|35->3|38->6|38->6|38->6|39->7|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|47->15|48->16|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|54->22|55->23|55->23|55->23|55->23|55->23|55->23|55->23|56->24|57->25|57->25|57->25|67->35|69->37
                  -- GENERATED --
              */
          