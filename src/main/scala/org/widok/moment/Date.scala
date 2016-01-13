package org.widok.moment

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait Date extends js.Object with Getters with Setters[Date] {
  def toDate(): js.Date = js.native
  def toISOString(): String = js.native
  def fromNow(): String = js.native
  def fromNow(withoutSuffix: Boolean): String = js.native
  def isDate(): Boolean = js.native
  def isValid(): Boolean = js.native
  def format(): String = js.native
  def format(pattern: String): String = js.native
  def startOf(unit: String): Date = js.native
  def endOf(unit: String): Date = js.native
  def calendar(): String = js.native
  def isBefore(date: Date): Boolean = js.native
  def isBefore(date: Date, unit: String): Boolean = js.native
  def isAfter(date: Date): Boolean = js.native
  def isAfter(date: Date, unit: String): Boolean = js.native
  def isoWeekday(): Int = js.native
  def isoWeekday(newDay: Int): Date = js.native
  def diff(date: Date): Int = js.native
  def diff(date: Date, unit: String): Int = js.native
  def diff(date: Date, unit: String, asFloat: Boolean): Double = js.native
  def local(): Date = js.native
  def utc(): Date = js.native
  def utcOffset(): Int = js.native
  def utcOffset(newOffset: String): Int = js.native
  def utcOffset(newOffset: Int): Int = js.native
  def zone(): Double = js.native
  def zone(b: Double): Date = js.native

  def tz(tz: String): Date = js.native
  def tz(date: String, format: String, tz: String): Date = js.native

  @JSName("valueOf")
  def value(): Double = js.native
}
