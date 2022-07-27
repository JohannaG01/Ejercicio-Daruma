ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "Ejercicio"
  )
val scalatestVersion = "3.2.7"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % Test