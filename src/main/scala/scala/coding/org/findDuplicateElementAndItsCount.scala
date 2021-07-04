package main.scala.org.coding.questions.mayank

/**
  * Find the Duplicate element in the array and its count
  */
object findDuplicateElementAndItsCount {
  def duplicate(a: Array[Int]): Unit = {
    val n = a.length
    var count = 1
    for (i <- 0 until n) {
      for (j <- i + 1 until n) {
        if (a(i) == a(j) && a(i) != -1) {
          count += 1
          a(j) = -1
        }
      }
      if (a(i) != -1 && count != 1) {
        println("Duplicate element in the array is: " + a(i) + " and it is " + count + " times")
        count = 1
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val a = Array(4, 3, 1, 6, 8, 1, 5, 1, 6)
    duplicate(a)
  }
}
