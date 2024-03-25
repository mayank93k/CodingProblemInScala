package scala.coding.org.subArray

object longestSubArrayNonNegative {
  def main(args: Array[String]): Unit = {
    val a = Array(1, 5, 3, 0, 8, 0, 0, -1, 3, 6, 8, -5, 1, 2, 3, 8, 9, 7)
    val output = longestSubArrayNonNegative(a)
    println(output)
  }

  /**
   * This method generates the longest non negative element in the array
   *
   * @param a -> Given Array
   * @return -> count of longest non negative element
   */
  private def longestSubArrayNonNegative(a: Array[Int]): Int = {
    var res = 0
    val n = a.length
    for (i <- 0 until n) {
      var j = i
      var count = 0
      while (j < n && a(j) >= 0) {
        count += 1
        j += 1
      }
      res = Math.max(res, count)
    }
    res
  }
}
