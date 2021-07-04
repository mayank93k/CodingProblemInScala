package main.scala.org.coding.questions.mayank

object largestSmallestElement {
  /**
    * Find the largest number in Unsorted Array
    *
    * @param a -> Unsorted Array
    */
  def largest(a: Array[Int]): Unit = {
    var max = a(0)
    for (i <- 1 to a.length - 1) {
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
  def smallest(a: Array[Int]): Unit = {
    var min = a(0)
    for (i <- 1 to a.length - 1) {
      if (a(i) < min) {
        min = a(i)
      }
    }
    println("Smallest number of array is: " + a.min)
  }

  def main(args: Array[String]): Unit = {
    val p = Array(3, 5, 1, 16, 45, 4, 10)
    largest(p)
    smallest(p)
  }
}
