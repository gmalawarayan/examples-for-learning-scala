import scala.util.{Failure, Success, Try}

object Main extends App {
  print("hello world  ")

  val fruits = Set("orange", "peach", "apple", "banana")
  val x = fruits.filter(_.startsWith("a"))
  val y = fruits.filter(_.length > 5)

  println(x)
  println(y)

  private val employees = Set("Malaw", "someone1", "Someone2")
  private val meaningOfLife = "Happy"
  println(checkIfEmployee)

  checkIfEmployee = employees.find(_ == "something").getOrElse("Employee Not Found")
  println(checkIfEmployee)
  private val isVowel = Set('a', 'e', 'i', 'o', 'u')
  meaningOfLife match {
    case "Happy" => "I am Happy"
    case "Sad" => "I am Sad"
  }

  println(meaningOfLife)
  private val stringToCheck = "Malawarayan"
  private val outcome = Try(10 / 0)

  println(isThisLetterAVowel)
  private val expression = Set("Good Morning", "Good Afternoon", "Good Evening", "Good Night")
  var checkIfEmployee = employees.find(_ == "Malaw").get
  println(vowelsInString(stringToCheck))
  var result = StringToInt("5")

  println("is it successful ", outcome.isSuccess)
  println("is it a failure ", outcome.isFailure)

  outcome match {
    case Success(value) => println("it is a successful computation ", value)
    case Failure(e) => println("it is a unsuccessful computation ", e.getMessage)
  }
  private var isThisLetterAVowel = isVowel('t')

  private def vowelsInString(stringToCheckIfWordHasVowels: String) = stringToCheckIfWordHasVowels.filterNot(isVowel)
  println(result)
  result = StringToInt("hello")

  private def StringToInt(string: String): Either[String, Int] = {
    try {
      Right(string.toInt)
    } catch {
      case error: NumberFormatException => Left("Error: " + error.getMessage)
    }
  }

  result = dividingByZero(5)
  println(result)
  result = dividingByZero(0)
  println(result)

  private def dividingByZero(number: Int): Either[String, Int] = {
    try {
      Right(number / 0)
    } catch {
      case error: Exception => Left("Error: " + error.getMessage)
    }
  }

  expression.foreach {
    case "Good Morning" => println("it is in the morning")
    case "Good Afternoon" => println("It is in the afternoon")
    case "Good Evening" => println("It is in the evening")
    case _ => println("not sure what time of the day it is")
  }


}
