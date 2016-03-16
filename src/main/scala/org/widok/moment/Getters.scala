package org.widok.moment

import scala.scalajs.js

@js.native
trait Getters extends js.Object {
  def millisecond(): Int = js.native
  def second(): Double = js.native
  def minute(): Double = js.native
  def hour(): Double = js.native
  def day(): Double = js.native
  def month(): Double = js.native
  def year(): Double = js.native
  def date(): Int = js.native
}
