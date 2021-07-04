package main.scala.org.coding.questions.mayank

object reverseArray {
  /**
    * How do you reverse an array?
    */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(1, 2, 5, 1, 8, 9, 4, 3)
    for (i <- 0 to a.length - 1) {
      for (j <- i + 1 to a.length - 1) {
        val temp = a(j)
        a(j) = a(i)
        a(i) = temp
      }
    }
    println("The reverse array is: " + a.mkString(","))
  }
}
