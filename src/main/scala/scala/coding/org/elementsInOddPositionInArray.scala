package scala.coding.org

object elementsInOddPositionInArray {
  /**
   * Program to print the elements of an array present on odd position(i=1,3,5....treat i=0 as position 1 ).
   */
  def main(args: Array[String]): Unit = {
    val a: Array[Int] = Array(1, 2, 3, 4, 5)
    for (i <- a.indices by 2) {
      println("Element in odd position in array is:" + a(i))
    }
  }
}
