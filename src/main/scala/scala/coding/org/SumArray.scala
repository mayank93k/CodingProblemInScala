package scala.coding.org

object SumArray {
  /**
   * Program to print the sum of all the elements of an array.
   */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(1, 3, 4, 42, 10)
    var sum = 0
    for (i <- a.indices) {
      sum += a(i)
    }
    println(sum)
  }
}
