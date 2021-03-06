lazy val root = Project("root", file("."))
  .settings(commonSettings)
  .settings(
    name := "Scala Starter",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-free" % "2.1.0",
      "org.typelevel" %% "cats-effect" % "2.0.0",
      "org.scalatest" %% "scalatest" % "3.1.0" % "test",
    ),
    versionReconciliation ++= Seq(
      "org.typelevel" %% "cats-core" % "semver",
    ),
  )

lazy val commonSettings = Seq(
  version := "0.1.0",
  scalaVersion := "2.13.1",
  scalacOptions --= {
    if (sys.env.get("CI").isDefined) {
      Seq.empty
    } else {
      Seq("-Xfatal-warnings")
    }
  },
)
