seq(ScctPlugin.instrumentSettings : _*)
seq(com.github.theon.coveralls.CoverallsPlugin.coverallsSettings: _*)

// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.1.1")
addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.1.1")
addSbtPlugin("reaktor" % "sbt-scct" % "0.2-SNAPSHOT")
addSbtPlugin("com.github.theon" %% "xsbt-coveralls-plugin" % "0.0.3")