package scala.coding.org

object largestSmallestElement {
  def main(args: Array[String]): Unit = {
    val p = Array(3, 5, 1, 16, 45, 4, 10)
    largest(p)
    smallest(p)
  }

  /**
   * Find the largest number in Unsorted Array
   *
   * @param a -> Unsorted Array
   */
  private def largest(a: Array[Int]): Unit = {
    var max = a(0)
    for (i <- 1 until a.length) {
      if (a(i) > max) {
        max = a(i)
      }

    }
    println("largest element of array is: " + max)
  }

  /**
   * Find the smallest number in Unsorted Array
   *
   * @param a -> Unsorted Array
   */
  private def smallest(a: Array[Int]): Unit = {
    var min = a(0)
    for (i <- 1 until a.length) {
      if (a(i) < min) {
        min = a(i)
      }
    }
    println("Smallest number of array is: " + a.min)
  }
}
