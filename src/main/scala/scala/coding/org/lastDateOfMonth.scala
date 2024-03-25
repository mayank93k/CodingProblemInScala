package scala.coding.org

object lastDateOfMonth {
  def main(args: Array[String]): Unit = {
    val date: String = "01022016"
    monthEnd(date)
  }

  /**
   * This method gives the last date of the given month
   *
   * @param date -> Date
   */
  private def monthEnd(date: String): Unit = {
    val year = date.substring(4, 8)
    val month = date.substring(2, 4)
    val monthYear = date.substring(2, 8)
    var day: String = ""
    if (month.toInt == 1 || month.toInt == 3 || month.toInt == 5 || month.toInt == 7 || month.toInt == 8 || month.toInt == 10 || month.toInt == 12) {
      day = "31"
      println("Last date of the month is: " + day.concat(monthYear))
    }
    else if (month.toInt == 4 || month.toInt == 6 || month.toInt == 9 || month.toInt == 11) {
      day = "30"
      println("Last date of the month is: " + day.concat(monthYear))
    } else if (month.toInt == 2) {
      val leapYearCheck = leapYear.yearLeap(year.toInt)
      if (leapYearCheck) {
        day = "29"
        println("Last date of the month is: " + day.concat(monthYear))
      } else if (!leapYearCheck) {
        day = "28"
        println("Last date of the month is: " + day.concat(monthYear))
      }
    }
  }
}
