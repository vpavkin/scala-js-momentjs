lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js façade for Moment.js"

normalizedName := "scala-js-momentjs"

version := "0.1.0-SNAPSHOT"

organization := "io.github.widok"

scalaVersion := "2.11.5"

libraryDependencies +=
  "org.webjars" % "momentjs" % "2.9.0"

jsDependencies +=
  "org.webjars" % "momentjs" % "2.9.0" / "moment-with-locales.min.js"
