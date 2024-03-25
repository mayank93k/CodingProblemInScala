package scala.coding.org

object sortArrayInAscendingOrder {
  /**
   * Program to sort the elements of an array in ascending order.
   */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(4, 2, 6, 7, 1, 9, 3)

    for (i <- a.indices) {
      for (j <- i + 1 until a.length) {
        if (a(i) > a(j)) {
          val temp = a(i)
          a(i) = a(j)
          a(j) = temp
        }
      }
    }
    println("Ascending Order of Array:")
    for (i <- a.indices) {
      print(a(i) + " ")
    }
  }
}
