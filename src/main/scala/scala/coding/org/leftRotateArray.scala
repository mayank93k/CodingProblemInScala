package main.scala.org.coding.questions.mayank

object leftRotateArray {
  /**
    * Program to left rotate the elements of an array.
    */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(1, 2, 3, 4, 5, 1)
    val n = 2
    for (i <- 1 to n) {
      for (j <- 0 to a.length - 2) {
        val temp = a(j)
        a(j) = a(j + 1)
        a(j + 1) = temp
      }
    }
    println("Array after rotating left: " + a.mkString(","))
  }
}
