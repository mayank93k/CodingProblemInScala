package scala.coding.org.array.problems

/**
 * Rearrange array such that even positioned are greater than odd
 *
 * Examples:
 *
 * Input: N = 4, arr[] = {1, 2, 2, 1}
 * Output: 2 1 2 1
 * Explanation:
 * For i = 1, arr[1] <= arr[0]. So, 1 <= 2.
 * For i = 2, arr[2] >= arr[1]. So, 2 >= 1.
 * For i = 3, arr[3] <= arr[2]. So, 1 <= 2.
 *
 * Input: arr[] = {1, 3, 2}
 * Output: 3 1 2
 * Explanation:
 * For i = 1, arr[1] <= arr[0]. So, 1 <= 3.
 * For i = 2, arr[2] >= arr[1]. So, 2 >= 1.
 */
object RearrangeArrayEvenOdd {

  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 2, 1)
    //val arr = Array(1, 3, 2)
    val rearrangeArray = rearrangeArrayEvenOdd(arr)
    for (ele <- rearrangeArray) {
      print(ele + " ")
    }
  }

  private def rearrangeArrayEvenOdd(arr: Array[Int]): Array[Int] = {
    for (i <- 0 until arr.length - 1) {
      if (i % 2 == 0 && arr(i) < arr(i + 1)) {
        val temp = arr(i)
        arr(i) = arr(i + 1)
        arr(i + 1) = temp
      }
    }
    arr
  }

}
