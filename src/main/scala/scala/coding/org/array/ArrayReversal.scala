package scala.coding.org.array

/**
 * Reversal algorithm for Array rotation
 * Given an array arr[] of size N, the task is to rotate the array by d position to the left.
 *
 * Examples:
 * Input:  arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
 * Output: 3, 4, 5, 6, 7, 1, 2
 * Explanation: If the array is rotated by 1 position to the left, it becomes {2, 3, 4, 5, 6, 7, 1}.
 * When it is rotated further by 1 position, it becomes: {3, 4, 5, 6, 7, 1, 2}
 *
 * Input: arr[] = {1, 6, 7, 8}, d = 3
 * Output: 8, 1, 6, 7
 */
object ArrayReversal {
  def main(args: Array[String]): Unit = {
    //    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    //    val pos = 2
    val arr = Array(1, 6, 7, 8)
    val pos = 3
    val reverseArray = arrayReversal(arr, pos)
    for (ele <- reverseArray) {
      print(ele + " ")
    }

  }

  private def arrayReversal(array: Array[Int], noOfPosition: Int): Array[Int] = {
    for (_ <- 0 until noOfPosition) {
      for (j <- 0 until array.length - 1) {
        val temp = array(j)
        array(j) = array(j + 1)
        array(j + 1) = temp
      }
    }
    array
  }
}
