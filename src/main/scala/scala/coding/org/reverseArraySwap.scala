package scala.coding.org

/**
 * About: Get the reverse of Array
 */
object reverseArraySwap {
  def main(args: Array[String]): Unit = {
    val a = Array(5, 3, 9, 11, 2, 17, 2)
    println("Input Array: " + a.mkString(","))
    val b = reverseArray(a)
    println("Reverse Array: " + b.mkString(","))
  }

  /**
   * This method gives the reverse Int element after swap
   *
   * @param arr -> Array element
   * @return
   */
  def reverseArray(arr: Array[Int]): Array[Int] = {
    var start = 0
    var end = arr.length - 1
    while (start < end) {
      val temp = arr(start)
      arr(start) = arr(end)
      arr(end) = temp
      start += 1
      end -= 1
    }
    arr
  }
}
