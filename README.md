# Moment.js façade for Scala.js

## Installation
Add the following dependency to your `build.sbt`:

```scala
libraryDependencies +=
  "io.github.widok" %%% "scala-js-momentjs" % "0.1.5"
```

## Example
```scala
import org.widok.moment._

Moment.locale("en_GB")

Moment().calendar()
Moment(millis).calendar()
Moment(millis).fromNow()
```

## License
This façade is licensed under the terms of the Apache v2.0 license.

## Authors
* Tim Nieradzik
* Erik LaBianca
