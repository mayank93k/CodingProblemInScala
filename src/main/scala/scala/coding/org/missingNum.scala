package main.scala.org.coding.questions.mayank

object missingNum {
  /**
    * How do you find the missing number in a given integer array of 1 to 100?
    *
    * @param number -> Elements in Array
    * @param n      -> Array length
    */
  def missingNumber(number: Array[Int], n: Int): Unit = {
    var total = ((n + 1) * (n + 2)) / 2
    for (i <- 0 to n - 1) {
      total = total - number(i)
    }
    println("Missing number in array is: " + total)
  }

  def main(args: Array[String]): Unit = {
    val number = Array(1, 2, 7, 5, 6, 3)
    missingNumber(number, number.length)
  }
}
