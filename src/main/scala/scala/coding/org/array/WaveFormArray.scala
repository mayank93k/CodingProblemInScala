package scala.coding.org.array

/**
 * Sort an array in wave form.
 *
 * Given an unsorted array of integers, sort the array into a wave array. An array arr[0..n-1] is sorted in wave form if:
 * arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
 *
 * Examples:
 * Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
 * Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}
 * Explanation:
 * here you can see {10, 5, 6, 2, 20, 3, 100, 80} first element is larger than the second and the same thing is repeated again and again.
 * large element – small element-large element -small element and so on .it can be small element-larger element –
 * small element-large element -small element too. all you need to maintain is the up-down fashion which represents a wave.
 *
 *
 * Input: arr[] = {20, 10, 8, 6, 4, 2}
 * Output: arr[] = {20, 8, 10, 4, 6, 2}
 */
object WaveFormArray {
  def main(args: Array[String]): Unit = {
    val arr = Array(10, 5, 6, 3, 2, 20, 100, 80)
    //val arr = Array(20, 10, 8, 6, 4, 2)
    val waveArray = waveFormArray(arr)
    for (ele <- waveArray) {
      print(ele + " ")
    }
  }

  private def waveFormArray(arr: Array[Int]): Array[Int] = {
    var i = 0
    while (i < arr.length - 1) {
      if (arr(i) >= arr(i + 1) && i + 2 == arr.length) {
        i += 1
      } else if (arr(i) >= arr(i + 1) && arr(i + 1) <= arr(i + 2)) {
        i += 2
      } else if (i >= 2) {
        if (arr(i) >= arr(i + 1) && arr(i + 1) >= arr(i + 2)) {
          i = i + 1
          val temp = arr(i)
          arr(i) = arr(i + 1)
          arr(i + 1) = temp
          i = i + 1
        } else {
          val temp = arr(i)
          arr(i) = arr(i + 1)
          arr(i + 1) = temp
        }
      } else {
        if (arr(i + 1) > arr(i + 2)) {
          val temp = arr(i + 1)
          arr(i + 1) = arr(i + 2)
          arr(i + 2) = temp
          i = i + 2
        }
      }
    }
    arr
  }
}

