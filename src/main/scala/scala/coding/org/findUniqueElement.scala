package main.scala.org.coding.questions.mayank

object findUniqueElement {
  /**
    * This method find the unique element in the array.
    *
    * @param a -> Array Elements
    */
  def unique(a: Array[Int]): Unit = {
    var count = 1
    val n = a.length - 1
    for (i <- 0 to n) {
      for (j <- i + 1 to n) {
        if (a(i).equals(a(j))) {
          count += 1
          a(j) = -1
        }
      }
      if (a(i) != -1 && count != 1) {
        count = 1
      } else if (a(i) != -1 && count == 1) {
        println("The unique element is: " + a(i))
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val a = Array(1, 1, 5, 5, 3, 10, 10, 2, 2, 4)
    unique(a)
  }
}
