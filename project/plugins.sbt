val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.31")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.0-M2")

if (scalaJSVersion.startsWith("0.6.")) {
  addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler-sjs06" % "0.16.0")
} else {
  addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.16.0")
}

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")
