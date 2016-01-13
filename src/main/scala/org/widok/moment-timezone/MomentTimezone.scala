package org.widok.tz

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import org.widok.moment._

@js.native
@JSName("moment-timezone")
trait MomentTimezone extends js.Object {
  def apply(tz: String): MTDate = js.native
  def apply(date: Double, tz: String): MTDate = js.native
  def apply(date: String, tz: String): MTDate = js.native

  def zone(tz: String): MomentZone = js.native
  def names(): js.Array[String] = js.native

  def guess(): String = js.native
}

@js.native
trait MTDate extends js.Object {
  def format(format: String): String = js.native
  def format(): String = js.native
}