package compatibilty

import moment.Moment
import org.scalatest.{FunSuite, MustMatchers}

class TimezoneSpec extends FunSuite with MustMatchers {

  test("names") {
    noException should be thrownBy Moment.tz.names()
  }

}
