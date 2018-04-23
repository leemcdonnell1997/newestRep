// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/play-java-seed/conf/routes
// @DATE:Mon Apr 23 13:35:45 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def news(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "news")
    }
  
    // @LINE:16
    def videos(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "videos")
    }
  
    // @LINE:14
    def index(cat:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "index" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:7
    def addGame(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addGame")
    }
  
    // @LINE:20
    def support(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "support")
    }
  
    // @LINE:22
    def reviews(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviews")
    }
  
    // @LINE:8
    def addGameSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addGameSubmit")
    }
  
    // @LINE:9
    def updateGame(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateGame/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:28
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:30
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:28
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:32
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
