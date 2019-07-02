package moment

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSName

@js.native
trait CalendarOpts extends js.Object {
  val sameDay: UndefOr[String] = js.native
  val nextDay: UndefOr[String] = js.native
  val lastDay: UndefOr[String] = js.native
  val lastWeek: UndefOr[String] = js.native
  val sameElse: UndefOr[String] = js.native
}

@js.native
trait Date extends js.Object with Getters with Setters[Date] {
  def toDate(): js.Date = js.native
  def toISOString(): String = js.native
  def fromNow(): String = js.native
  def fromNow(withoutSuffix: Boolean): String = js.native
  def isValid(): Boolean = js.native
  def format(): String = js.native
  def format(pattern: String): String = js.native
  def startOf(unit: String): Date = js.native
  def endOf(unit: String): Date = js.native
  def calendar(): String = js.native
  def calendar(reference: Date): String = js.native
  def calendar(reference: UndefOr[Date], opts: CalendarOpts): String = js.native
  def isBefore(date: Date): Boolean = js.native
  def isBefore(date: Date, unit: String): Boolean = js.native
  def isBetween(m1: Date, m2: Date): Boolean = js.native
  def isAfter(date: Date): Boolean = js.native
  def isAfter(date: Date, unit: String): Boolean = js.native
  def isSame(date: Date): Boolean = js.native
  def isSame(date: Date, unit: String): Boolean = js.native
  def isoWeekday(): Int = js.native
  def isoWeekday(newDay: Int): Date = js.native
  def diff(date: Date): Int = js.native
  def diff(date: Date, unit: String): Double = js.native
  def diff(date: Date, unit: String, asFloat: Boolean): Double = js.native
  def local(): Date = js.native
  def utc(): Date = js.native
  def utcOffset(): Double = js.native
  def utcOffset(newOffset: String): Date = js.native
  def utcOffset(newOffset: Int): Date = js.native

  def unix(): Double = js.native

  def tz(tz: String): Date = js.native
  def tz(): String = js.native

  def seconds(n: Int): Date = js.native
  def minutes(n: Int): Date = js.native
  def hours(n: Int): Date = js.native

  // direct field setters
  def millisecond(value: Double): Date = js.native
  def second(value: Double): Date = js.native
  def minute(value: Double): Date = js.native
  def hour(value: Double): Date = js.native
  def day(value: Double): Date = js.native
  def month(value: Double): Date = js.native
  def year(value: Double): Date = js.native
  def date(value: Double): Date = js.native

  @JSName("valueOf")
  def value(): Double = js.native

  def isDST(): Boolean = js.native
}
