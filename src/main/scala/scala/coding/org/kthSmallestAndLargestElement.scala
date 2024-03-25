package scala.coding.org

/**
 * About: Get the kth Smallest and kth Largest element
 */
object kthSmallestAndLargestElement {
  def main(args: Array[String]): Unit = {
    val a = Array(5, 3, 11, 7, 6, 18, 4, 1)
    val k = 1
    kSmallestElement(a, k)
    kLargestElement(a, k)
  }

  /**
   * This method gets the kth Smallest element
   *
   * @param a -> Array element
   * @param k -> kth position
   */
  private def kSmallestElement(a: Array[Int], k: Int): Unit = {
    val arr = BubbleSortInAscendingOrder(a)
    val smallestElement = arr(k - 1)
    println(smallestElement)
  }

  /**
   * This method sort the array in Ascending order
   *
   * @param a -> Array element
   * @return -> Return the sorted array
   */
  private def BubbleSortInAscendingOrder(a: Array[Int]): Array[Int] = {
    for (i <- a.indices) {
      for (j <- i + 1 until a.length) {
        if (a(i) > a(j)) {
          val temp = a(j)
          a(j) = a(i)
          a(i) = temp
        }
      }
    }
    a
  }

  /**
   * This method gets the kth Largest element
   *
   * @param a -> Array element
   * @param k -> kth position
   */
  private def kLargestElement(a: Array[Int], k: Int): Unit = {
    val arr = BubbleSortInDescendingOrder(a)
    val largestElement = arr(k - 1)
    println(largestElement)
  }

  /**
   * This method sort the array in Descending order
   *
   * @param a -> Array element
   * @return -> Return the sorted array
   */
  private def BubbleSortInDescendingOrder(a: Array[Int]): Array[Int] = {
    for (i <- a.indices) {
      for (j <- i + 1 until a.length) {
        if (a(i) < a(j)) {
          val temp = a(j)
          a(j) = a(i)
          a(i) = temp
        }
      }
    }
    a
  }
}
