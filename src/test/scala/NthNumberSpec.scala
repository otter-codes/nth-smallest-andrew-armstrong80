import org.scalatest._

class NthNumberSpec extends WordSpec with MustMatchers {

  "nth" must {

    "return 1 when given List(1) and 1" in {
      NthNumber.nth(List(1), 1) mustEqual 1
    }

    "return 1 when given List(1, 2) and 2" in {
      NthNumber.nth(List(1, 2), 2) mustEqual 1
    }

    "return 4 when given List(1, 2, 3, 4, 5) and 2" in {
      NthNumber.nth(List(1, 2, 3, 4, 5), 2) mustEqual 4
    }

    "return 3 when given List(3, 3, 4, 4, 5, 5) and 3" in {
      NthNumber.nth(List(3, 3, 4, 4, 5, 5), 3) mustEqual 3
    }
    
    "return 7 when given List(7, 3, 9, 2, 8, 8, 4, 3) and 3" in {
      NthNumber.nth(List(7, 3, 9, 2, 8, 8, 4, 3), 3) mustEqual 7
    }

    "Throw OutOfBoundsException 'Out of scope' when given List(1, 2) and 3" in {

      val e = intercept[IndexOutOfBoundsException] {
        NthNumber.nth(List(1, 2), 3)
      }
      e.getMessage mustEqual "Out of scope"
    }
  }
}
