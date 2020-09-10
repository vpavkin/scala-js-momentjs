package compatibilty

import moment.Moment
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers

class TimezoneSpec extends AnyFunSuite with Matchers {

  test("names") {
    noException should be thrownBy Moment.tz.names()
  }

}
