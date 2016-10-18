lazy val scalaJsMomentJs = project.in(file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(jsEnv := NodeJSEnv().value)

name := "Scala.js façade for Moment.js"

normalizedName := "scala-js-momentjs"

version := "0.2.1-SNAPSHOT"

organization := "io.github.widok"

scalaVersion := "2.11.8"

val MomentVersion = "2.15.1"
val MomentTimezoneVersion = "0.5.5"

libraryDependencies ++= Seq(
  "org.webjars.npm" % "moment" % MomentVersion,
  "org.webjars.npm" % "moment-timezone" % MomentTimezoneVersion)

jsDependencies ++= Seq(
  "org.webjars.npm" % "moment" % MomentVersion
    / s"$MomentVersion/min/moment-with-locales.js"
    minified "min/moment-with-locales.min.js"
    commonJSName "moment",

  "org.webjars.npm" % "moment-timezone" % MomentTimezoneVersion
    / "moment-timezone-with-data.js"
    minified "builds/moment-timezone-with-data.min.js"
    dependsOn s"moment/$MomentVersion/min/moment-with-locales.js"
)

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
