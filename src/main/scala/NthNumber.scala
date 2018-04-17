object NthNumber extends App {

  def nth (input : List[Int], num : Int) : Int = {
    val distinctList = input.distinct.reverse
    distinctList(num-1)
  }


}
