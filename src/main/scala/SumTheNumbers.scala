object SumTheNumbers extends App {

  println(sumOfNumbers(List("1","2","2","3","5")))
  private def sumOfNumbers(listOfNumbersToAdd : List[String]): Int = {
    listOfNumbersToAdd.map(_.toInt).sum
  }

  private val numbers = List("1","2","2","3","5", "something")
  private def toInt(number: String): Option[Int] = {
    try {
      Some(number.toInt)
    } catch {
      case e: NumberFormatException => None
    }
  }

  println(numbers.flatMap(toInt(_)).sum)

}
