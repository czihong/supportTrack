import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "supportTrack"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    	"mysql" % "mysql-connector-java" % "5.1.18",
    	"org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
