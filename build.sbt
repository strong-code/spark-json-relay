name := "spark-json-relay"

version := "2.0.1"

scalaVersion := "2.10.4"

val json4s = "org.json4s" %% "json4s-jackson" % "3.2.10"

libraryDependencies += json4s

spName := "hammerlab/spark-json-relay"

sparkVersion := "2.0"
