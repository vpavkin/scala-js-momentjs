# Moment.js façade for Scala.js

[![Maven Central](https://img.shields.io/maven-central/v/ru.pavkin/scala-js-momentjs_sjs0.6_2.11.svg)](https://github.com/vpavkin/scala-js-momentjs)

## Installation
Add the following dependency to your `build.sbt`:

```scala
libraryDependencies +=
  "ru.pavkin" %%% "scala-js-momentjs" % "0.4.1"
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

## Versions of Moment.js

| Facade | Moment.js | Moment-timezone | Scala versions |
| :-----:|:---------:|:---------------:|:---------------:
| 0.5.0  | 2.17.1    | 0.5.11          | 2.11.8, 2.12.1 |
| 0.4.1  | 2.16.0    | 0.5.9           | 2.11.8, 2.12.0 |
| 0.4.0  | 2.16.0    | 0.5.9           | 2.11.8         |
| 0.3.3  | 2.15.2    | 0.5.5           | 2.11.8         |
| 0.3.2  | 2.15.1    | 0.5.5           | 2.11.8         |
| 0.3.1  | 2.15.1    | 0.5.5           | 2.11.8         |

## License
This façade is licensed under the terms of the Apache v2.0 license.

## Authors
* Tim Nieradzik
* Erik LaBianca
* Vladimir Pavkin
