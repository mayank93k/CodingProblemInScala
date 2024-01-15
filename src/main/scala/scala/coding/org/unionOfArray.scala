package scala.coding.org

object unionOfArray {
  def main(args: Array[String]): Unit = {
    val a = Array(5, 10, 15, 20, 25)
    val b = Array(25, 30, 35, 40, 45, 50, 55)
    println("The Union Element is: ")
    union(a, b)
  }

  /**
   * This method gets the union of arrays
   *
   * @param a -> First Array
   * @param b -> Second Array
   */
  private def union(a: Array[Int], b: Array[Int]): Unit = {
    var i = 0
    var j = 0
    val a_n = a.length - 1
    val b_n = b.length - 1
    while (i <= a_n && j <= b_n) {
      if (a(i) < b(j)) {
        print(a(i) + " ")
        i = i + 1
      } else if (a(i) > b(j)) {
        print(b(j) + " ")
        j += 1
      } else {
        print(a(i) + " ")
        i += 1
        j += 1
      }
    }
    while (i <= a_n) {
      print(a(i) + " ")
      i += 1
    }
    while (j <= b_n) {
      print(b(j) + " ")
      j += 1
    }
  }
}
