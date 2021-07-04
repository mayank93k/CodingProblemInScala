package main.scala.org.coding.questions.mayank

object removeDuplicate {
  /**
    * How are duplicates removed from a given array in Java?
    *
    * @param number  -> Elements in Array
    * @param visited ->No of times element visited
    * @param num     -.Empty array to store count of element
    * @return
    */
  def removeDuplicate(number: Array[Int], visited: Int, num: Array[Int]): Any = {
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
    println("The Unique element in Array after removing duplicate:")
    for (i <- 0 to num.length - 1) {
      if (num(i) != visited) {
        print(number(i) + " ")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val number: Array[Int] = Array(1, 1, 2, 3, 4, 5, 5, 17, 17, 4, 1)
    val num: Array[Int] = new Array[Int](number.length)
    val visited = -1
    removeDuplicate(number, visited, num)
  }
}
