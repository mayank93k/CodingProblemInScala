package scala.coding.org.subArray

object subArrayOfGivenSumArray {
  def main(args: Array[String]): Unit = {
    val a = Array(3, 4, -7, 1, 3, 3, 1, -4)
    val sum = 7
    subArrayOfGivenSumArray(a, sum)
  }

  /**
   * This method find the given sum found between the indexes
   *
   * @param a   -> Given array
   * @param sum -> Given Sum
   */
  private def subArrayOfGivenSumArray(a: Array[Int], sum: Int): Unit = {
    val n = a.length
    for (i <- 0 until n) {
      var sum_so_far = 0
      for (j <- i until n) {
        sum_so_far += a(j)
        if (sum_so_far == sum) {
          println("Sum found between indexes " + i + " and " + j) //sum found between two sub arrays
          var k = i
          while (k <= j) { //elements of sub array with sum found
            print(a(k) + " ")
            k += 1
          }
          println("\n")
        }
      }
    }

  }
}
