name := """GAMINGSITE"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.12", "2.12.4")


libraryDependencies ++= Seq(guice, evolutions, javaJdbc)

// include the H2 Dependency

libraryDependencies += "com.h2database" % "h2" % "1.4.192"

// Load dependencies

