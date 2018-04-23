// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/play-java-seed/conf/routes
// @DATE:Mon Apr 23 13:35:45 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:28
  LoginController_2: controllers.LoginController,
  // @LINE:32
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:28
    LoginController_2: controllers.LoginController,
    // @LINE:32
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addGame""", """controllers.HomeController.addGame"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addGameSubmit""", """controllers.HomeController.addGameSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateGame/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateGame(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.HomeController.index(cat:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """videos""", """controllers.HomeController.videos"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """news""", """controllers.HomeController.news"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """support""", """controllers.HomeController.support"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviews""", """controllers.HomeController.reviews"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_addGame0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addGame")))
  )
  private[this] lazy val controllers_HomeController_addGame0_invoker = createInvoker(
    HomeController_0.addGame,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addGame",
      Nil,
      "GET",
      this.prefix + """addGame""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_addGameSubmit1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addGameSubmit")))
  )
  private[this] lazy val controllers_HomeController_addGameSubmit1_invoker = createInvoker(
    HomeController_0.addGameSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addGameSubmit",
      Nil,
      "POST",
      this.prefix + """addGameSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_updateGame2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateGame/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateGame2_invoker = createInvoker(
    HomeController_0.updateGame(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateGame",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateGame/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_HomeController_index3_invoker = createInvoker(
    HomeController_0.index(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """index""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_videos4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("videos")))
  )
  private[this] lazy val controllers_HomeController_videos4_invoker = createInvoker(
    HomeController_0.videos,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "videos",
      Nil,
      "GET",
      this.prefix + """videos""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_news5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("news")))
  )
  private[this] lazy val controllers_HomeController_news5_invoker = createInvoker(
    HomeController_0.news,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "news",
      Nil,
      "GET",
      this.prefix + """news""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_support6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("support")))
  )
  private[this] lazy val controllers_HomeController_support6_invoker = createInvoker(
    HomeController_0.support,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "support",
      Nil,
      "GET",
      this.prefix + """support""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_reviews7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviews")))
  )
  private[this] lazy val controllers_HomeController_reviews7_invoker = createInvoker(
    HomeController_0.reviews,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "reviews",
      Nil,
      "GET",
      this.prefix + """reviews""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_LoginController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login8_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_LoginController_loginSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit9_invoker = createInvoker(
    LoginController_2.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_LoginController_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout10_invoker = createInvoker(
    LoginController_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_addGame0_route(params@_) =>
      call { 
        controllers_HomeController_addGame0_invoker.call(HomeController_0.addGame)
      }
  
    // @LINE:8
    case controllers_HomeController_addGameSubmit1_route(params@_) =>
      call { 
        controllers_HomeController_addGameSubmit1_invoker.call(HomeController_0.addGameSubmit)
      }
  
    // @LINE:9
    case controllers_HomeController_updateGame2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateGame2_invoker.call(HomeController_0.updateGame(id))
      }
  
    // @LINE:14
    case controllers_HomeController_index3_route(params@_) =>
      call(params.fromQuery[Long]("cat", None)) { (cat) =>
        controllers_HomeController_index3_invoker.call(HomeController_0.index(cat))
      }
  
    // @LINE:16
    case controllers_HomeController_videos4_route(params@_) =>
      call { 
        controllers_HomeController_videos4_invoker.call(HomeController_0.videos)
      }
  
    // @LINE:18
    case controllers_HomeController_news5_route(params@_) =>
      call { 
        controllers_HomeController_news5_invoker.call(HomeController_0.news)
      }
  
    // @LINE:20
    case controllers_HomeController_support6_route(params@_) =>
      call { 
        controllers_HomeController_support6_invoker.call(HomeController_0.support)
      }
  
    // @LINE:22
    case controllers_HomeController_reviews7_route(params@_) =>
      call { 
        controllers_HomeController_reviews7_invoker.call(HomeController_0.reviews)
      }
  
    // @LINE:28
    case controllers_LoginController_login8_route(params@_) =>
      call { 
        controllers_LoginController_login8_invoker.call(LoginController_2.login)
      }
  
    // @LINE:29
    case controllers_LoginController_loginSubmit9_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit9_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:30
    case controllers_LoginController_logout10_route(params@_) =>
      call { 
        controllers_LoginController_logout10_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:32
    case controllers_Assets_versioned11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
