package scala.coding.org

object removeDuplicate {
  def main(args: Array[String]): Unit = {
    val number: Array[Int] = Array(1, 1, 2, 3, 4, 5, 5, 17, 17, 4, 1)
    val num: Array[Int] = new Array[Int](number.length)
    val visited = -1
    removeDuplicate(number, visited, num)
  }

  /**
   * How are duplicates removed from a given array in Java?
   *
   * @param number  -> Elements in Array
   * @param visited ->No of times element visited
   * @param num     -.Empty array to store count of element
   * @return
   */
  private def removeDuplicate(number: Array[Int], visited: Int, num: Array[Int]): Any = {
    for (i <- number.indices) {
      var count = 1
      for (j <- i + 1 until number.length) {
        if (number(i) == number(j)) {
          count += 1
          num(j) = visited
        }
      }
      if (num(i) != visited)
        num(i) = count
    }
    println("The Unique element in Array after removing duplicate:")
    for (i <- num.indices) {
      if (num(i) != visited) {
        print(number(i) + " ")
      }
    }
  }
}
