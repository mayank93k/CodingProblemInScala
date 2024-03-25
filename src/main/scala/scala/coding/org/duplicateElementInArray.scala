package scala.coding.org

import scala.collection.mutable.ArrayBuffer

/**
 * Find the Duplicate element in the array
 */
object duplicateElementInArray {
  def main(args: Array[String]): Unit = {
    val a = Array(1, 5, 3, 2, 4, 1, 2, 1, 1, 5, 5, 9)
    duplicate(a)
  }

  def duplicate(a: Array[Int]): Unit = {
    val n = a.length - 1
    val arr: ArrayBuffer[Int] = new ArrayBuffer[Int](n)
    for (i <- 0 to n) {
      for (j <- i + 1 to n) {
        if ((a(i) == a(j)) && (i != j)) {
          if (!arr.contains(a(j))) {
            println("Duplicate element in the array is: " + a(j))
          }
          val p = a(j)
          arr += p
        }
      }
    }
  }
}
