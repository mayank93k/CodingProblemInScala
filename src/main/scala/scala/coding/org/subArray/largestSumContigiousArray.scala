package scala.coding.org.subArray

object largestSumContigiousArray {
  /**
    * This method gives the largest sum in given array
    *
    * @param a -> Given Array
    * @return -> return the usm of the array
    */
  def largestSumContigiousArray(a: Array[Int]): Int = {
    var max_so_far = 0
    var max_ending_here = 0
    val n = a.length
    for (i <- 0 until n) {
      max_ending_here += a(i)

      if (max_ending_here < 0) {
        max_ending_here = 0
      }
      if (max_so_far < max_ending_here) {
        max_so_far = max_ending_here
      }
    }
    max_so_far
  }

  def main(args: Array[String]): Unit = {
    val a = Array(-2, -3, 4, -1, -2, 1, 5, -3)
    val output = largestSumContigiousArray(a)
    println(output)
  }
}
