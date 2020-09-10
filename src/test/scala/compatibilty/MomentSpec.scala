package compatibilty

import moment.{Moment, Units}
import org.scalatest.Assertion
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers

import scala.scalajs.js

class MomentSpec extends AnyFunSuite with Matchers {

  test("isDate") {
    Moment.isDate() mustBe false
  }

  test("isDate(momentDate)") {
    Moment.isDate(new js.Date()) mustBe true
  }

  test("apply(): Date") {
    compatAssert(Moment())
  }

  test("apply(any): Date") {
    compatAssert(js.Dynamic.literal(
      year = 2019, month = 3, day = 4, minutes = 50, hour = 15, seconds = 59, milliseconds = 999))
  }

  test("apply(millis: Double)") {
    compatAssert(Moment(100500))
  }

  test("apply(moment: Date): Date") {
    compatAssert(Moment(Moment()))
  }

  test("apply(date: js.Date): Date") {
    compatAssert(Moment(js.Date.UTC(2009, 1, 1)))
  }

  test("apply(string: String): Date") {
    compatAssert(Moment("2009-05-01"))
  }

  test("apply(string: String, format: String)") {
    compatAssert(Moment("2009-05-01", "YYYY-MM-DD"))
  }

  test("apply(string: String, format: String, locale: String): Date") {
    compatAssert(Moment("2009-05-01", "YYYY-MM-DD", "en"))
  }

  test("apply(string: String, format: String, strict: Boolean)") {
    compatAssert(Moment("2009-05-01", "YYYY-MM-DD", strict = true))
    compatAssert(Moment("2009-05-01", "YYYY-MM-DD", strict = false))
  }

  test("apply(string: String, format: String, locale: String, strict: Boolean): Date") {
    compatAssert(Moment("2009-05-01", "YYYY-MM-DD", "en", strict = true))
  }

  test("utc(): Date") {
    compatAssert(Moment.utc())
  }

  test("utc(millis: Double)") {
    compatAssert(Moment.utc(100500.0))
  }

  test("utc(arr: js.Array[Int])") {
    compatAssert(Moment.utc(js.Array(2010, 1, 14, 15, 25, 50, 125)))
  }

  test("utc(string: String)") {
    compatAssert(Moment.utc("2013-02-04T22:44:30.652Z"))
  }

  test("utc(string: String, format: String)") {
    compatAssert(Moment.utc("2013-02-04T22:44:30.652Z"))
  }

  test("utc(string: String, formats: js.Array[String])") {
    compatAssert(Moment.utc("2013-02-04T22:44:30", js.Array("YYYY-MM-DD:HH:MM:SS")))
  }

  test("utc(string: String, format: String, locale: String)") {
    compatAssert(Moment.utc("2013-02-04T22:44:30", "YYYY-MM-DD:HH:MM:SS", "de"))
  }

  test("utc(moment: Date): Date") {
    compatAssert(Moment.utc(Moment()))
  }

  test("utc(date: js.Date)") {
    compatAssert(Moment.utc(js.Date.UTC(2009, 1, 1)))
  }

  test("locale(s: String)") {
    compatAssert(Moment.locale("en"))
  }

  test("duration(millis: Int)") {
    compatAssert(Moment.duration(100500))
  }

  test("duration(time: Int, unit: String)") {
    compatAssert(Moment.duration(100500, Units.Second))
  }

  test("duration(time: String)") {
    compatAssert(Moment.duration("23:59:59"))
  }

  test("weekdaysShort()") {
    compatAssert(Moment.weekdaysShort())
  }

  test("weekdaysShort(index: Int)") {
    compatAssert(Moment.weekdaysShort(2))
  }

  test("tz(millis: Double, zone: String)") {
    compatAssert(Moment.tz(100500.0, "Australia/Sydney"))
  }

  test("tz(arr: js.Array[Int], zone: String)") {
    compatAssert(Moment.tz(js.Array(2010, 1, 14, 15, 25, 50, 125), "Australia/Sydney"))
  }

  test("tz(moment: Date, zone: String)") {
    compatAssert(Moment.tz(Moment(), "Australia/Sydney"))
  }

  test("tz(date: js.Date, zone: String)") {
    compatAssert(Moment.tz(js.Date.UTC(2009, 1, 1), "Australia/Sydney"))
  }

  test("tz(string: String, zone: String): Date") {
    compatAssert(Moment.tz("2013-02-04T22:44:30.652Z", "Australia/Sydney"))
  }

  test("tz(string: String, format: String, zone: String)") {
    compatAssert(Moment.tz("2013-02-04T22:44:30", "YYYY-MM-DD:HH:MM:SS", "Australia/Sydney"))
  }

  test("tz(string: String, format: String, locale: String, zone: String)") {
    compatAssert(Moment.tz("2013-02-04T22:44:30", "YYYY-MM-DD:HH:MM:SS", "en", "Australia/Sydney"))
  }

  test("tz(string: String, format: String, strict: Boolean, zone: String)") {
    compatAssert(Moment.tz("2013-02-04T22:44:30", "YYYY-MM-DD:HH:MM:SS", strict = true, "Australia/Sydney"))
  }

  test("tz(string: String, format: String, locale: String, strict: Boolean, zone: String)") {
    compatAssert(Moment.tz("2013-02-04T22:44:30", "YYYY-MM-DD:HH:MM:SS", "en", strict = true, "Australia/Sydney"))
  }

  test("tz") {
    compatAssert(Moment.tz)
  }

  private def compatAssert[T](t: => T): Assertion =
    noException should be thrownBy t
}
