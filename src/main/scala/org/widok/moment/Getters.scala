package org.widok.moment

import scala.scalajs.js

@js.native
trait Getters extends js.Object {
  def milliseconds(): Int = js.native
  def seconds(): Double = js.native
  def minutes(): Double = js.native
  def hours(): Double = js.native
  def days(): Double = js.native
  def months(): Double = js.native
  def years(): Double = js.native
}
