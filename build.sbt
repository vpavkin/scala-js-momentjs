lazy val scalaJsMomentJs = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js façade for Moment.js"

normalizedName := "scala-js-momentjs"

version := "0.1.5-SNAPSHOT"

organization := "io.github.widok"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.webjars" % "momentjs" % "2.11.1",
  "org.webjars" % "moment-timezone" % "0.4.0")

jsDependencies ++= Seq(
  "org.webjars" % "momentjs" % "2.11.1" / "moment.min.js",
  "org.webjars" % "moment-timezone" % "0.4.0" / "moment-timezone-with-data.js")

pomExtra :=
  <url>https://github.com/widok/scala-js-momentjs</url>
  <licenses>
    <license>
      <name>Apache-2.0</name>
      <url>https://www.apache.org/licenses/LICENSE-2.0.html</url>
    </license>
  </licenses>
  <scm>
    <url>git://github.com/widok/widok.git</url>
  </scm>
  <developers>
    <developer>
      <id>tindzk</id>
      <name>Tim Nieradzik</name>
      <url>http://github.com/tindzk/</url>
    </developer>
  </developers>
