package scala.coding.org

object reverseArray {
  /**
   * How do you reverse an array?
   */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(1, 2, 5, 1, 8, 9, 4, 3)
    for (i <- a.indices) {
      for (j <- i + 1 until a.length) {
        val temp = a(j)
        a(j) = a(i)
        a(i) = temp
      }
    }
    println("The reverse array is: " + a.mkString(","))
  }
}
