package main.scala.org.coding.questions.mayank

object sortArrayInDescendingOrder {
  /**
    * Program to sort the elements of an array in descending order.
    */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(7, 3, 1, 2, 4, 8)
    for (i <- 0 to a.length - 1) {
      for (j <- i + 1 to a.length - 1) {
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
