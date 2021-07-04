package main.scala.org.coding.questions.mayank

import scala.collection.mutable.HashSet
import scala.util.control.Breaks

/**
  * Find the Duplicate element in the array
  */
object duplicateUsingHashSet {
  var loop = new Breaks

  def duplicate(a: Array[Int]): Unit = {
    val hashSet: HashSet[Int] = new HashSet[Int]
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

  def main(args: Array[String]): Unit = {
    val a = Array(5, 3, 3, 4, 6, 9, 8, 1, 9)
    duplicate(a)
  }

}
