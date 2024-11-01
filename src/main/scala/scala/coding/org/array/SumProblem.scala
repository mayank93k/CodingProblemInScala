package scala.coding.org.array

object SumProblem {

  def main(args: Array[String]): Unit = {
    val a = Array(10, 11, 12, 14)
    val b = Array(4, 5, 6, 9)
    val sign = Array('+', '-', '*', '+')
    val c = Array(14, 6, 70, 23)

    val result = sumProblem(a, b, sign, c)

    for (res <- result) {
      println(res)
    }
  }

  def sumProblem(ints: Array[Int], ints1: Array[Int], chars: Array[Char], ints2: Array[Int]): Array[Boolean] = {
    var resArr: Array[Boolean] = Array()
    for (i <- chars.indices) {
      val res = chars(i) match {
        case '+' => ints(i) + ints1(i)
        case '-' => ints(i) - ints1(i)
        case '*' => ints(i) * ints1(i)
        case '/' => ints(i) / ints1(i)
      }
      if (res == ints2(i)) {
        resArr :+= true
      } else {
        resArr :+= false
      }
    }
    resArr
  }
}




