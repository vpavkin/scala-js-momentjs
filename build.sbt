lazy val scalaJsMomentJs = project.in(file(".")).
  enablePlugins(ScalaJSBundlerPlugin).
  settings(jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv())

name := "Scala.js façade for Moment.js"

normalizedName := "scala-js-momentjs"

organization := "ru.pavkin"

scalaVersion := "2.13.8"

scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.CommonJSModule)
}

lazy val npmDeps = Seq(
  "moment-timezone" -> MomentTimezoneVersion
)

npmDependencies in Compile ++= npmDeps
npmDependencies in Test ++= npmDeps

val MomentTimezoneVersion = "0.5.35"
val ScalaTestVersion = "3.2.13"

libraryDependencies ++= Seq(
  "org.scalatest" %%% "scalatest" % ScalaTestVersion % "test",
  "org.scalatest" %%% "scalatest-mustmatchers" % ScalaTestVersion % "test",
  "org.scalatest" %%% "scalatest-funsuite" % ScalaTestVersion % "test",
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
