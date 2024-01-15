package scala.coding.org

import scala.collection.mutable
import scala.util.control.Breaks

/**
 * Find the Duplicate element in the array
 */
object duplicateUsingHashSet {
  private val loop = new Breaks

  def main(args: Array[String]): Unit = {
    val a = Array(5, 3, 3, 4, 6, 9, 8, 1, 9)
    duplicate(a)
  }

  def duplicate(a: Array[Int]): Unit = {
    val hashSet: mutable.HashSet[Int] = new mutable.HashSet[Int]
    loop.breakable {
      for (key <- a) {
        if (!hashSet.contains(key)) {
          hashSet.add(key)
        } else {
          println("The first duplicate element is: " + key)
          loop.break()
        }
      }
    }
  }

}
