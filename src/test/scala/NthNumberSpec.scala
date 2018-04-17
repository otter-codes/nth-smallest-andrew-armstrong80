import org.scalatest._

class NthNumberSpec extends WordSpec with MustMatchers {

  "nth" must {

    "return 1 when given List(1) and 1" in {
      NthNumber.nth(List(1), 1) mustEqual 1
    }

    "return 1 when given List(1, 2) and 2" in {
      NthNumber.nth(List(1, 2), 2) mustEqual 1
    }

    "return List(1, 2, 3, 4, 5) and 2" in {
      NthNumber.nth(List(1, 2, 3, 4, 5), 2) mustEqual 4
    }

  }

}
