package main.scala.org.coding.questions.mayank

/**
  * About: Get the kth Smallest and kth Largest element
  */
object kthSmallestAndLargestElement {
  /**
    * This method sort the array in Descending order
    *
    * @param a -> Array element
    * @return -> Return the sorted array
    */
  def BubbleSortInDescendingOrder(a: Array[Int]): Array[Int] = {
    for (i <- 0 to a.length - 1) {
      for (j <- i + 1 to a.length - 1) {
        if (a(i) < a(j)) {
          val temp = a(j)
          a(j) = a(i)
          a(i) = temp
        }
      }
    }
    a
  }

  /**
    * This method sort the array in Ascending order
    *
    * @param a -> Array element
    * @return -> Return the sorted array
    */
  def BubbleSortInAscendingOrder(a: Array[Int]): Array[Int] = {
    for (i <- 0 to a.length - 1) {
      for (j <- i + 1 to a.length - 1) {
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
    * This method gets the kth Smallest element
    *
    * @param a -> Array element
    * @param k -> kth position
    */
  def kSmallestElement(a: Array[Int], k: Int): Unit = {
    val arr = BubbleSortInAscendingOrder(a)
    val smallestElement = arr(k - 1)
    println(smallestElement)
  }

  /**
    * This method gets the kth Largest element
    *
    * @param a -> Array element
    * @param k -> kth position
    */
  def kLargestElement(a: Array[Int], k: Int): Unit = {
    val arr = BubbleSortInDescendingOrder(a)
    val largestElement = arr(k - 1)
    println(largestElement)
  }

  def main(args: Array[String]): Unit = {
    val a = Array(5, 3, 11, 7, 6, 18, 4, 1)
    val k = 1
    kSmallestElement(a, k)
    kLargestElement(a, k)
  }
}
