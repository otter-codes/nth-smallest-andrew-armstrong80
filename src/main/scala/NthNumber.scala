object NthNumber extends App {

  def nth (input : List[Int], num : Int) : Int = {
    input.length - (num - 1)
  }

}
