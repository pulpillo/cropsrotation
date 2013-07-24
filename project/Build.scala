import sbt._
import Keys._
import play.Project._
import com.github.theon.coveralls.CoverallsPlugin._

object ApplicationBuild extends Build {

  val appName         = "cropsrotation"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(ScctPlugin.instrumentSettings:_*).settings(com.github.theon.coveralls.CoverallsPlugin.coverallsSettings: _*).settings(
  )

}
