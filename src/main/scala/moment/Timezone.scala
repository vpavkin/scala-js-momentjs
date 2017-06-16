package moment

import scala.scalajs.js

@js.native
trait Timezone extends js.Any {
  def names(): js.Array[String] = js.native
}
