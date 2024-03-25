package scala.coding.org

object sortArrayInDescendingOrder {
  /**
   * Program to sort the elements of an array in descending order.
   */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(7, 3, 1, 2, 4, 8)
    for (i <- a.indices) {
      for (j <- i + 1 until a.length) {
        if (a(i) < a(j)) {
          val temp = a(i)
          a(i) = a(j)
          a(j) = temp
        }
      }
    }
    println("Descending Order of Array:")
    print(a.mkString(","))
  }
}
