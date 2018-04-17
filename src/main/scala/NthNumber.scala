object NthNumber extends App {

  def nth (input : List[Int], num : Int) : Int = {
    val distinctList = input.distinct.sorted.reverse
    if (distinctList.length < num) {
      throw new IndexOutOfBoundsException ("Out of scope")
      } else {
      distinctList(num-1)
    }
  }
}
