lazy val example = Project("example", file(".")).settings(
    name := "example",
    organization := "org.scalatest",
    version := "1.0.0",
    scalaVersion := "2.12.8", 
    libraryDependencies ++=
    Seq(
      "org.scalatest" %% "scalatest" % "3.0.6-SNAP-for-scalafix" % "test",
      "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",
      "org.easymock" % "easymockclassextension" % "3.2" % "test",
      "org.jmock" % "jmock-legacy" % "2.8.3" % "test",
      "org.mockito" % "mockito-core" % "1.10.19" % "test",
      "org.seleniumhq.selenium" % "selenium-java" % "2.45.0" % "test",
      "junit" % "junit" % "4.12" % "test",
      "org.testng" % "testng" % "6.7" % "test"
    ), 
    scalafixDependencies in ThisBuild += "org.scalatest" %% "external-packages-rename" % "1.0.0", 
    addCompilerPlugin(scalafixSemanticdb) // enable SemanticDB
)
