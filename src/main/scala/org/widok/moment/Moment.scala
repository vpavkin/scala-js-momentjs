package org.widok.moment

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("moment")
object Moment extends js.Object {
  def apply(): Date = js.native

  /* Long has different semantics than JavaScript's numbers, therefore Double
   * must be used.
   */
  def apply(millis: Double): Date = js.native

  def apply(moment: Date): Date = js.native
  def apply(date: js.Date): Date = js.native
  def apply(string: String): Date = js.native
  def apply(string: String, format: String): Date = js.native
  def apply(string: String, format: String, locale: String): Date = js.native
  def apply(string: String, format: String, strict: Boolean): Date = js.native
  def apply(string: String, format: String, locale: String, strict: Boolean): Date = js.native

  def locale(s: String): Unit = js.native

  def duration(millis: Int): Duration = js.native
  def duration(time: Int, unit: String): Duration = js.native
  def duration(time: String): Duration = js.native
}
