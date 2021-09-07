val zioVersion = "2.0.0-M2"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % zioVersion
)

scalacOptions ++= Seq(
  "-deprecation"
)