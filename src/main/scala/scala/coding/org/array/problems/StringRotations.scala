package scala.coding.org.array.problems

/**
 * Check if given strings are rotations of each other or not
 *
 * Examples:
 * Input: S1 = ABCD, S2 = CDAB
 * Output: Strings are rotations of each other
 *
 * Input: S1 = ABCD, S2 = ACBD
 * Output: Strings are not rotations of each other
 */
object StringRotations {

  def main(args: Array[String]): Unit = {
    val s1 = "ABCD"
    val s2 = "DABA"
    val rotationCheck = stringRotation(s1, s2)
    println("String rotated: " + rotationCheck)
  }

  private def stringRotation(s1: String, s2: String): Boolean = {
    val stringArray = s1.toCharArray

    for (_ <- 1 until stringArray.length) {
      for (j <- 0 until stringArray.length - 1) {
        val temp = stringArray(j)
        stringArray(j) = stringArray(j + 1)
        stringArray(j + 1) = temp
        if (stringArray.mkString == s2) {
          return true
        }
      }
    }
    false
  }
}
