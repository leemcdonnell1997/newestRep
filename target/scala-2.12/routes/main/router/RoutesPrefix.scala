// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/play-java-seed/conf/routes
// @DATE:Mon Apr 23 13:35:45 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
