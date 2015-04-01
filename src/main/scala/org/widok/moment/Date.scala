package org.widok.moment

import scala.scalajs.js

object Units {
  val Millisecond = "millisecond"
  val Second = "second"
  val Minute = "minute"
  val Hour = "hour"
  val Day = "day"
  val Date = "date"
  val Week = "week"
  val ISOWeek = "isoweek"
  val Month = "month"
  val Quarter = "quarter"
  val Year = "year"
}

trait Date extends js.Object with Getters with Setters[Date] {
  def toDate(): js.Date = js.native
  def toISOString(): String = js.native
  def add(amt: Int, unit: String): Date = js.native
  def subtract(amt: Int, unit: String): Date = js.native
  def fromNow(): String = js.native
  def fromNow(withoutSuffix: Boolean): String = js.native
  def isDate(): Boolean = js.native
  def format(): String = js.native
  def format(pattern: String): String = js.native
  def startOf(unit: String): Date = js.native
  def endOf(unit: String): Date = js.native
  def calendar(): String = js.native
  def isBefore(date: Date): Boolean = js.native
  def isBefore(date: Date, unit: String): Boolean = js.native
  def isAfter(date: Date): Boolean = js.native
  def isAfter(date: Date, unit: String): Boolean = js.native
}
