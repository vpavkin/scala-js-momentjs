package compatibilty

import moment.{Moment, Units}
import org.scalatest._

class DateSpec extends FunSuite with MustMatchers {

  val jsDate: Double = scala.scalajs.js.Date.UTC(2019, 5, 1)

  test("toDate") {
    Moment().toDate() mustBe a[scala.scalajs.js.Date]
  }

  test("toISOString") {
    compatAssert(_.toISOString())
  }

  test("fromNow") {
    compatAssert(_.fromNow())
  }

  test("fromNow with suffix / without suffix") {
    compatAssert(_.fromNow(true))
    compatAssert(_.fromNow(false))
  }

  test("isValid()") {
    compatAssert(_.isValid())
  }

  test("format()") {
    compatAssert(_.format())
  }

  test("format(pattern: String)") {
    compatAssert(_.format("MM-DD-YYYY"))
  }

  test("startOf") {
    compatAssert(_.startOf("hour"))
  }

  test("endOf") {
    compatAssert(_.endOf("hour"))
  }

  test("calendar") {
    compatAssert(_.calendar())
    compatAssert(_.calendar(Moment()))
  }

  test("isBefore") {
    compatAssert(_.isBefore(Moment(jsDate)))
  }

  test("isBefore with units") {
    compatAssert(_.isBefore(Moment(jsDate), Units.Year))
  }

  test("isBetween") {
    compatAssert(_.isBetween(Moment(jsDate), Moment(jsDate)))
  }

  test("isAfter") {
    compatAssert(_.isAfter(Moment(jsDate)))
  }

  test("isAfter(date: Date, unit: String): Boolean") {
    compatAssert(_.isAfter(Moment(jsDate), Units.Year))
  }

  test("isSame") {
    compatAssert(_.isSame(Moment(jsDate)))
  }

  test("isSame with units") {
    compatAssert(_.isSame(Moment(jsDate), Units.Year))
  }

  test("isoWeekday") {
    compatAssert(_.isoWeekday())
  }

  test("isoWeekday(newDay)") {
    compatAssert(_.isoWeekday(4))
  }

  test("diff") {
   compatAssert(_.diff(Moment(jsDate)))
  }

  test("diff(unit)") {
    compatAssert(_.diff(Moment(jsDate), "year"))
  }

  test("diff(date: Date, unit: String, asFloat: Boolean)") {
    compatAssert(_.diff(Moment(jsDate), "year", asFloat = true))
  }

  test("local") {
    compatAssert(_.local())
  }

  test("utc") {
    compatAssert(_.utc())
  }

  test("utcOffset") {
    compatAssert(_.utcOffset())
  }

  test("utcOffset(newOffset: String)") {
    compatAssert(_.utcOffset("+02:00"))
  }

  test("utcOffset(newOffset: Int)") {
    compatAssert(_.utcOffset(90))
  }

  test("unix") {
    compatAssert(_.unix())
  }

  test("tz(tz: String): Date") {
    compatAssert(_.tz("Australia/Sydney"))
  }
  
  test("tz(): String") {
    compatAssert(_.tz("Australia/Sydney").tz())
  }

  test("seconds(n: Int): Date") {
    compatAssert(_.seconds(30))
  }

  test("minutes(n: Int): Date") {
    compatAssert(_.minutes(30))
  }

  test("hours(n: Int): Date") {
    compatAssert(_.hours(1))
  }

  test("millisecond(value: Double): Date") {
    compatAssert(_.millisecond(100))
  }

  test("second(value: Double): Date") {
    compatAssert(_.second(40))
  }

  test("minute(value: Double): Date") {
    compatAssert(_.minute(100))
  }
  
  test("hour(value: Double): Date") {
    compatAssert(_.hour(4))
  }

  test("day(value: Double): Date") {
    compatAssert(_.day(10))
  }
  
  test("month(value: Double): Date") {
    compatAssert(_.month(5))
  }

  test("year(value: Double): Date") {
    compatAssert(_.year(2009))
  }
  
  test("date(value: Double): Date") {
    compatAssert(_.date(30))
  }

  test("value(): Double") {
    Moment(jsDate).value() mustBe Moment(jsDate).value()
  }

  test("isDST(): Boolean") {
    Moment(jsDate).isDST() mustBe Moment(jsDate).isDST()
  }

  test("millisecond(): Int") {
    compatAssert(_.millisecond())
  }

  test("second(): Int") {
    compatAssert(_.second())
  }

  test("minute(): Int") {
    compatAssert(_.minute())
  }

  test("hour(): Int") {
    compatAssert(_.hour())
  }

  test("day(): Int") {
    compatAssert(_.day())
  }

  test("month(): Int") {
    compatAssert(_.month())
  }

  test("year(): Int") {
    compatAssert(_.year())
  }

  test("date(): Int") {
    compatAssert(_.date())
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
    compatAssert(_.subtract(Moment.duration("01:00:00")))
  }

  private def compatAssert[T](t: moment.Date => T) =
    noException should be thrownBy t(Moment(jsDate))
  
}
