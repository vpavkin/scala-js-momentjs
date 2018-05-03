lazy val scalaJsMomentJs = project.in(file(".")).
  enablePlugins(ScalaJSBundlerPlugin).
  settings(jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv())

name := "Scala.js façade for Moment.js"

normalizedName := "scala-js-momentjs"

version := "0.9.2-SNAPSHOT"

organization := "ru.pavkin"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.11", "2.12.4")

scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }

val MomentTimezoneVersion = "0.5.14"

npmDependencies in Compile ++= Seq(
  "moment-timezone" -> MomentTimezoneVersion
)

pomExtra :=
  <url>https://github.com/vpavkin/scala-js-momentjs</url>
    <licenses>
      <license>
        <name>Apache-2.0</name>
        <url>https://www.apache.org/licenses/LICENSE-2.0.html</url>
      </license>
    </licenses>
    <scm>
      <url>git://github.com/vpavkin/scala-js-momentjs.git</url>
    </scm>
    <developers>
      <developer>
        <id>tindzk</id>
        <name>Tim Nieradzik</name>
        <url>http://github.com/tindzk/</url>
      </developer>
      <developer>
        <id>vpavkin</id>
        <name>Vladimir Pavkin</name>
        <url>http://github.com/vpavkin/</url>
      </developer>
    </developers>

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)
