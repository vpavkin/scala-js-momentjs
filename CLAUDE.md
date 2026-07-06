# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this is

A Scala.js façade (typed bindings) for Moment.js and moment-timezone, published to Maven Central as `ru.pavkin %%% scala-js-momentjs`. There is no application code — the library is a thin `@js.native` layer over the npm packages `moment` and `moment-timezone`.

## Commands

Everything goes through sbt (sbt 1.12.x, Scala 2.13, Scala.js 1.22.0):

- `sbt compile` — compile
- `sbt test` — run all tests (compiles to JS and runs under Node.js; requires Node installed, scalajs-bundler installs npm deps automatically)
- `sbt "testOnly compatibilty.MomentSpec"` — run a single test suite (note the package is spelled `compatibilty`, not `compatibility`)
- `sbt release` — publish a release via sbt-release/sbt-sonatype (requires PGP key and Sonatype credentials in `project/credentials.sbt`, which is not checked in)

## Architecture

- Build uses **scalajs-bundler** (`ScalaJSBundlerPlugin`) with `ModuleKind.CommonJSModule`; npm dependencies (`moment`, `moment-timezone`) are declared in `build.sbt` and bundled at build/test time. Tests run in a Node.js `jsEnv`.
- All bindings live in `src/main/scala/moment/`:
  - `Moment.scala` — the entry point. The `Moment` object is `@JSImport("moment-timezone", Namespace, "moment")`, i.e. it imports **moment-timezone** (which wraps moment), so `tz` methods are available on the same object.
  - `Date.scala` — the main `Date` trait (a moment instance), mixing in `Getters` and `Setters[Date]`.
  - `Getters.scala` / `Setters.scala` — shared accessor traits; `Duration` also uses them.
  - `Duration.scala`, `Timezone.scala` — bindings for durations and the `moment.tz` namespace.
  - `Units.scala` — plain Scala string constants for moment unit names (not a binding).
- Facade conventions: everything is `@js.native trait ... extends js.Object` with `= js.native` bodies; JS `number` timestamps map to `Double` (not `Long` — Long semantics differ from JS numbers); overloads mirror Moment.js call signatures.
- Tests in `src/test/scala/compatibilty/` are ScalaTest suites that exercise the façade against the real bundled Moment.js, verifying API compatibility with the pinned npm versions.

## CI

GitHub Actions (`.github/workflows/ci.yml`) runs `sbt clean test` on pushes to master and on pull requests (JDK 17, Node 20).

## Versioning

Version lives in `version.sbt` (managed by sbt-release). When bumping the pinned `moment`/`moment-timezone` npm versions in `build.sbt`, update the compatibility table in `README.md`.
