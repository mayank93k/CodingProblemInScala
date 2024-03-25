package scala.coding.org

object intersectionOfArray {
  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 3, 4, 5, 6, 15, 28)
    val b = Array(4, 9, 13, 15, 16, 17)
    val c = Array(4, 8, 10, 15, 28, 38, 45)
    println("The Intersected element is: ")
    intersect(a, b, c)
  }

  /**
   * This method gets the common element(Intersection) from all the input arrays
   *
   * @param a -> First Array
   * @param b -> Second Array
   * @param c -> Third Array
   */
  private def intersect(a: Array[Int], b: Array[Int], c: Array[Int]): Unit = {
    var i = 0
    var j = 0
    var k = 0
    val n_a = a.length - 1
    val n_b = b.length - 1
    val n_c = c.length - 1
    while (i < n_a && j < n_b && k < n_c) {
      if (a(i) < b(j) || a(i) < c(k)) {
        i += 1
      } else if (b(j) < a(i) || b(j) < c(k)) {
        j += 1
      } else if (c(k) < a(i) || c(k) < b(j)) {
        k += 1
      } else {
        print(a(i) + " ")
        i += 1
        j += 1
        k += 1
      }
    }
  }
}
