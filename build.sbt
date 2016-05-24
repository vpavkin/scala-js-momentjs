lazy val scalaJsMomentJs = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js façade for Moment.js"

normalizedName := "scala-js-momentjs"

version := "0.1.6-SNAPSHOT"

organization := "io.github.widok"

scalaVersion := "2.11.8"

val MomentVersion = "2.12.0"
val MomentTimezoneVersion = "0.5.1"

libraryDependencies ++= Seq(
  "org.webjars.npm" % "moment" % MomentVersion,
  "org.webjars.npm" % "moment-timezone" % MomentTimezoneVersion)

jsDependencies ++= Seq(
  "org.webjars.npm" % "moment" % MomentVersion
    / s"$MomentVersion/moment.js" minified "min/moment.min.js",

  "org.webjars.npm" % "moment" % MomentVersion
    / s"moment/$MomentVersion/min/locales.js"
    minified "min/locales.min.js"
    dependsOn s"$MomentVersion/moment.js",

  "org.webjars.npm" % "moment-timezone" % MomentTimezoneVersion
    / "moment-timezone-with-data.js"
    minified "builds/moment-timezone-with-data.min.js"
    dependsOn s"moment/$MomentVersion/min/locales.js"
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
