package org.widok.tz

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import org.widok.moment._

@js.native
trait MomentTimezone extends js.Object {
  def apply(tz: String): Date = js.native
  def apply(date: Double, tz: String): Date = js.native
  def apply(date: String, tz: String): Date = js.native

  def zone(tz: String): MomentZone = js.native
  def names(): js.Array[String] = js.native

  def guess(): String = js.native
}