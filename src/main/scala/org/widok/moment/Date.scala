package org.widok.moment

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

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
  def diff(date: Date): Duration = js.native
  def diff(date: Date, unit: String): Duration = js.native

  @JSName("valueOf")
  def value(): Double = js.native
}
