val zioVersion = "2.0.0"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % zioVersion
)

scalacOptions ++= Seq(
  "-deprecation"
)