package scala.coding.org.array.problems

/**
 * Move all zeroes to end of array
 *
 * Example:
 * Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
 * Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
 *
 * Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
 * Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 */
object MoveAllZeros {

  def main(args: Array[String]): Unit = {
    //val arr = Array(1, 2, 0, 4, 3, 0, 5, 0)
    val arr = Array(1, 2, 0, 0, 0, 3, 6)

    val moveZeros = moveAllZeros(arr)

    for (ele <- moveZeros) {
      print(ele + " ")
    }
  }

  private def moveAllZeros(arr: Array[Int]): Array[Int] = {
    val arrayLength = arr.length - 1
    for (i <- 0 until arrayLength) {
      if (arr(i) == 0 && arr(arrayLength) != 0) {
        val temp = arr(arrayLength)
        arr(arrayLength) = arr(i)
        arr(i) = temp
      } else if (arr(i) == 0 && arr(arrayLength) == 0) {
        val arrlength = arrayLength - 1
        val temp = arr(arrlength)
        arr(arrlength) = arr(i)
        arr(i) = temp
      }
    }

    arr
  }

}
