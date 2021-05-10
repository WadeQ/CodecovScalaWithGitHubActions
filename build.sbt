
name := "CodecovScala"
import com.typesafe.sbt.SbtNativePackager.Universal
scalaVersion := "2.13.1"
version := "1.0"

libraryDependencies += "org.seleniumhq.selenium" % "selenium-java"            % "3.141.59"
libraryDependencies += "commons-io"              % "commons-io"               % "2.8.0"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
libraryDependencies += "org.scalatest"          %% "scalatest"                % "3.2.8" % Test
libraryDependencies += "org.scalamock"          %% "scalamock"                % "5.1.0" % Test

enablePlugins(JavaAppPackaging)

mappings in Universal += {
  file("resources/chromedriver") -> "resources/chromedriver"
}