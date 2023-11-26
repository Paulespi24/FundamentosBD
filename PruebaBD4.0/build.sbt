ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "PruebaBD4.0",

    libraryDependencies ++= Seq(
      "com.typesafe.slick" %% "slick" % "3.5.0-M4",
      "com.h2database" % "h2" % "2.2.224",
      "ch.qos.logback" % "logback-classic" % "1.4.3",
      "com.typesafe.slick" %% "slick-hikaricp" % "3.5.0-M4",
      "com.typesafe" % "config" % "1.4.3",
      "mysql" % "mysql-connector-java" % "8.0.33"
    )


  )