package org.widok.tz

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait MomentZone extends js.Object {
  var name: String = js.native
  var abbrs: js.Array[String] = js.native
  var untils: js.Array[Double] = js.native
  var offsets: js.Array[Double] = js.native
  def abbr(timestamp: Double): String = js.native
  def offset(timestamp: Double): Double = js.native
  def parse(timestamp: Double): Double = js.native
}