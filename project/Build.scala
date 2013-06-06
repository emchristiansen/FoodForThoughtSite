import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "FoodForThoughtSite"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    libraryDependencies ++= Seq(
      "org.pegdown" % "pegdown" % "1.2.0"
    )
  )

}