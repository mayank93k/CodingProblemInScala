package scala.coding.org.array.problems

import scala.collection.mutable.ArrayBuffer


/**
 * Segregate even and odd numbers using Lomuto’s Partition Scheme.
 * Given an array arr[] of integers, segregate even and odd numbers in the array such that
 * all the even numbers should be present first, and then the odd numbers.
 *
 * Examples:
 * Input: arr[] = {7, 2, 9, 4, 6, 1, 3, 8, 5}
 * Output: 2 4 6 8 7 9 1 3 5
 *
 * Input: arr[] = {1, 3, 2, 4, 7, 6, 9, 10}
 * Output:  2 4 6 10 7 1 9 3
 */
object SegregateEvenOdd {
  def main(args: Array[String]): Unit = {

    //val arr = Array(7, 2, 9, 4, 6, 1, 3, 8, 5)
    val arr = Array(1, 3, 2, 4, 7, 6, 9, 10)
    val evenOdd = segregateEvenOdd(arr)

    for (ele <- evenOdd) {
      print(ele + " ")
    }
  }

  private def segregateEvenOdd(arr: Array[Int]): Array[Int] = {
    val tempEven = ArrayBuffer[Int]()
    val tempOdd = ArrayBuffer[Int]()

    for (i <- arr.indices) {
      if (arr(i) % 2 == 0) {
        tempEven += arr(i)
      } else {
        tempOdd += arr(i)
      }
    }

    (tempEven ++ tempOdd).toList.toArray
  }
}
