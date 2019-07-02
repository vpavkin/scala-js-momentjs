package compatibilty

import moment.{Moment, Units}
import org.scalatest.{Assertion, FunSuite, MustMatchers}

class DurationSpec extends FunSuite with MustMatchers {

  test("duration humanise without suffix") {
    Moment.duration(1).humanise() mustBe "a few seconds"
    Moment.duration(1, "year").humanise() mustBe "a year"
    Moment.duration("01:00:00").humanise() mustBe "an hour"
  }

  test("duration humanise with suffix") {
    Moment.duration(1).humanise(true) mustBe "in a few seconds"
  }

  test("millisecond(): Int") {
    compatAssert(_.milliseconds())
  }

  test("second(): Int") {
    compatAssert(_.seconds())
  }

  test("minute(): Int") {
    compatAssert(_.minutes())
  }

  test("hour(): Int") {
    compatAssert(_.hours())
  }

  test("day(): Int") {
    compatAssert(_.days())
  }

  test("month(): Int") {
    compatAssert(_.months())
  }

  test("year(): Int") {
    compatAssert(_.years())
  }

  test("add(time: Int, unit: String)") {
    compatAssert(_.add(10, Units.Hour))
  }

  test("add(time: Double, unit: String)") {
    compatAssert(_.add(10.5, Units.Year))
  }

  test("add(millis: Int)") {
    compatAssert(_.add(100500))
  }

  test("add(duration: Duration)") {
    compatAssert(_.add(Moment.duration("01:00:00")))
  }

  test("subtract(time: Int, unit: String)") {
    compatAssert(_.subtract(10, Units.Year))
  }

  test("subtract(time: Double, unit: String)") {
    compatAssert(_.subtract(10.5, Units.Second))
  }

  test("subtract(millis: Int)") {
    compatAssert(_.subtract(100500))
  }

  test("subtract(duration: Duration)") {
    compatAssert(_.subtract(Moment.duration("00:30:00")))
  }

  private def compatAssert[T](t: moment.Duration => T): Assertion =
    noException should be thrownBy t(Moment.duration("01:00:00"))

}
