package main.scala.org.coding.questions.mayank

object duplicateElem {
  /**
    * * How do you find the duplicate number on a given integer array?
    *
    * @param number  -> Elements in Array
    * @param visited -> No of times element visited
    * @param num     -> Empty array to store count of element
    */
  def duplicateNumber(number: Array[Int], visited: Int, num: Array[Int]): Unit = {
    for (i <- 0 to number.length - 1) {
      var count = 1
      for (j <- i + 1 to number.length - 1) {
        if (number(i) == number(j)) {
          count += 1
          num(j) = visited
        }
      }
      if (num(i) != visited)
        num(i) = count
    }
    for (i <- 0 to num.length - 1) {
      if (num(i) != visited && num(i) > 1) {
        println("The duplicate element in array is: " + number(i))
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val number: Array[Int] = Array(1, 1, 1)
    val num: Array[Int] = new Array[Int](number.length)
    val visited = -1
    duplicateNumber(number, visited, num)
  }
}
