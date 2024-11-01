package scala.coding.org.array

/**
 * Find the largest three distinct elements in an array
 *
 * Examples :
 * Input: arr[] = {10, 4, 3, 50, 23, 90}
 * Output: 90, 50, 23
 *
 * Input: arr[] = { 6, 8, 1, 9, 2, 1, 10, 10}
 * Output: 10, 10, 9
 */
object ThreeLargestElement {

  def main(args: Array[String]): Unit = {
    val arr = Array(10, 4, 3, 50, 23, 90)
    //val arr = Array(6, 8, 1, 9, 2, 1, 10, 10)
    val largestElement = threeLargestElement(arr)
    println("First max element: " + largestElement._1)
    println("Second max element: " + largestElement._2)
    println("Third max element: " + largestElement._3)
  }

  private def threeLargestElement(arr: Array[Int]): (Int, Int, Int) = {
    var max1 = arr(0)
    var max2 = 0
    var max3 = 0
    for (i <- 1 until arr.length) {
      if (arr(i) >= max1) {
        if (max2 < arr(i)) {
          max3 = max2
          max2 = max1
        }
        max1 = arr(i)
      } else if (arr(i) < max1 && arr(i) > max2) {
        max3 = max2
        max2 = arr(i)
      } else {
        if (max3 < arr(i)) {
          max3 = arr(i)
        }
      }
    }
    (max1, max2, max3)
  }

}
