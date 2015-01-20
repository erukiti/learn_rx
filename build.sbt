name := """learn_rx"""

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "io.reactivex"      % "rxjava"          % "1.0.4",
  "junit"             % "junit"           % "4.11"  % "test",
  "com.novocode"      % "junit-interface" % "0.10"  % "test"
)
