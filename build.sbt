name := "Scala Coding Challenges"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.8",
  "com.typesafe" % "config" % "1.4.3",
  "org.apache.spark" %% "spark-streaming" % "2.4.5",
  "org.apache.spark" %% "spark-sql" % "2.4.5",
  "org.scalatest" %% "scalatest" % "3.2.10"
)
