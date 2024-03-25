package scala.coding.org

object elementsInEvenPositionInArray {
  /**
   * Program to print the elements of an array present on even position(i=2,4,6....treat i=0 as position 1 ).
   */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(1, 2, 3, 4, 5, 6)
    for (i <- 1 until a.length by 2) {
      println("Elements in even position in array is:" + a(i))
    }
  }
}
