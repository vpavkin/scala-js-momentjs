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