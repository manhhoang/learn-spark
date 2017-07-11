name := "Spark-app"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
	"junit" % "junit" % "4.12" % "compile",
	"com.novocode" % "junit-interface" % "0.11" % "test",
	"org.specs2" %% "specs2-core" % "3.8.4" % "test",
	"org.scalatest" %% "scalatest" % "3.0.0" % "test",
	"org.apache.spark" %% "spark-core" % "2.1.0" % "compile",
	"org.apache.spark" %% "spark-sql" % "2.1.0" % "compile",
	"org.apache.spark" %% "spark-streaming" % "2.1.0" % "compile"
)


