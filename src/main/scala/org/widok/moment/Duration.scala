package org.widok.moment

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

trait Duration extends js.Object {
  @JSName("humanize")
  def humanise(): String = js.native

  @JSName("humanize")
  def humanise(withSuffix: Boolean): String = js.native

  def milliseconds(): Int = js.native
  def seconds(): Double = js.native
  def minutes(): Double = js.native
  def hours(): Double = js.native
  def days(): Double = js.native
  def months(): Double = js.native
  def years(): Double = js.native

  def add(time: Double, unit: String): Duration = js.native
  def add(millis: Int): Duration = js.native
  def add(duration: Duration): Duration = js.native

  def subtract(time: Double, unit: String): Duration = js.native
  def subtract(millis: Int): Duration = js.native
  def subtract(duration: Duration): Duration = js.native
}
