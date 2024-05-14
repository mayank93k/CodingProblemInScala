package scala.coding.org.array.problems

import org.scalatest.flatspec._
import org.scalatest.matchers._

import scala.coding.org.array.problems.SumProblem._

class ExampleSpec extends AnyFlatSpec with should.Matchers {
  "Sum of array A and B" should "return true for all except for multiple" in {
    val a = Array(10, 11, 12, 14)
    val b = Array(4, 5, 6, 9)
    val sign = Array('+', '-', '*', '+')
    val c = Array(14, 6, 70, 23)
    val result = sumProblem(a, b, sign, c)

    result(0) should be(true)
    result(1) should be(true)
    result(2) should be(false)
    result(3) should be(true)
  }

  "Sum of array A and B" should "return true for all" in {
    val a = Array(1, 10, 2, 4)
    val b = Array(4, 5, 6, 9)
    val sign = Array('+', '-', '*', '+')
    val c = Array(5, 5, 12, 13)
    val result = sumProblem(a, b, sign, c)

    result(0) should be(true)
    result(1) should be(true)
    result(2) should be(true)
    result(3) should be(true)
  }

  "Sum of array A and B" should "return false for all" in {
    val a = Array(1, 10, 2, 4)
    val b = Array(4, 5, 6, 9)
    val sign = Array('+', '-', '*', '+')
    val c = Array(15, 15, 22, 23)
    val result = sumProblem(a, b, sign, c)

    result(0) should be(false)
    result(1) should be(false)
    result(2) should be(false)
    result(3) should be(false)
  }

  "Sum of array A and B" should "return true for divide" in {
    val a = Array(12, 10)
    val b = Array(4, 5)
    val sign = Array('/', '/')
    val c = Array(3, 2)
    val result = sumProblem(a, b, sign, c)

    result(0) should be(true)
    result(1) should be(true)
  }

  "Sum of array A and B" should "return true and false for division " in {
    val a = Array(16, 10)
    val b = Array(4, 10)
    val sign = Array('/', '/')
    val c = Array(4, 2)
    val result = sumProblem(a, b, sign, c)

    result(0) should be(true)
    result(1) should be(false)
  }
}
