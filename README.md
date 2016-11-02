# Moment.js façade for Scala.js

[![Maven Central](https://img.shields.io/maven-central/v/ru.pavkin/scala-js-momentjs_sjs0.6_2.11.svg)](https://github.com/vpavkin/scala-js-momentjs)

## Installation
Add the following dependency to your `build.sbt`:

```scala
libraryDependencies +=
  "ru.pavkin" %%% "scala-js-momentjs" % "0.3.2"
```

## Example
```scala
import moment._

Moment.locale("en_GB")

Moment().calendar()
Moment(millis).calendar()
Moment(millis).fromNow()
```

## Versions 0.2.0 and earlier
If for some reason you want to use version prior to 0.3.1, then use following examples to import and use the facade:

```scala
libraryDependencies +=
  "io.github.widok" %%% "scala-js-momentjs" % "0.2.0"
```

```scala
import org.widok.moment._

Moment()
```

## License
This façade is licensed under the terms of the Apache v2.0 license.

## Authors
* Tim Nieradzik
* Erik LaBianca
* Vladimir Pavkin
