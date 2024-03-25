package scala.coding.org

object frequencyOfElementInArray {
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(1, 1, 3, 5, 5, 1, 5, 7)
    val Fr: Array[Int] = new Array[Int](a.length)
    val visited = -1
    arrayElementFrequency(a, Fr, visited)
  }

  /**
   * Program to find the frequency of each element of an array.
   *
   * @param a       -> Elements in Array
   * @param Fr      -> Empty array to store count of element
   * @param visited -> No of times element visited
   */
  private def arrayElementFrequency(a: Array[Int], Fr: Array[Int], visited: Int): Unit = {
    for (i <- a.indices) {
      var count = 1
      for (j <- i + 1 until a.length) {
        if (a(i) == a(j)) {
          count += 1
          Fr(j) = visited
        }
      }
      if (Fr(i) != visited)
        Fr(i) = count
    }
    for (i <- Fr.indices) {
      if (Fr(i) != visited) {
        println("The element: " + a(i) + " Appeared: " + Fr(i) + " times in the array")
      }
    }
  }
}
