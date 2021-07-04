package main.scala.org.coding.questions.mayank

object rightRotateArray {
  /**
    * Program to right rotate the elements of an array.
    */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(1, 2, 3, 4, 5)
    val n = 1
    for (i <- 1 to n) {
      for (j <- a.length - 1 to 1 by -1) {
        val temp = a(j)
        a(j) = a(j - 1)
        a(j - 1) = temp
      }
    }
    println("Array after rotating right: " + a.mkString(","))
  }
}
