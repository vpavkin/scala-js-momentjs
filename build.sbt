lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js façade for Moment.js"

normalizedName := "scala-js-momentjs"

version := "0.1.0"

organization := "io.github.widok"

scalaVersion := "2.11.6"

libraryDependencies +=
  "org.webjars" % "momentjs" % "2.10.3"

jsDependencies +=
  "org.webjars" % "momentjs" % "2.10.3" / "moment-with-locales.min.js"
