

import scala.util.{Failure, Success, Try}


object Main extends App {
  print("hello world  ")

  val fruits = Set("orange", "peach", "apple", "banana")
  val x = fruits.filter(_.startsWith("a"))
  val y = fruits.filter(_.length > 5)

  println(x)
  println(y)

  val employees = Set("Malaw", "someone1", "Someone2")

  var checkIfEmployee = employees.find(_ ==  "Malaw").get
  println(checkIfEmployee)

   checkIfEmployee = employees.find(_ ==  "something").getOrElse("Employee Not Found")
  println(checkIfEmployee)

  val meaningOfLife = "Happy"
  meaningOfLife match {
    case "Happy" => "I am Happy"
    case "Sad" => "I am Sad"
  }

  println(meaningOfLife)

  val isVowel = Set('a', 'e', 'i', 'o', 'u')

  var isThisLetterAVowel = isVowel('t')

  println(isThisLetterAVowel)

  def vowelsInString(string : String) = string.filterNot(isVowel)

  println(vowelsInString("Malawarayan"))


  val outcome = Try (10/0)

  println("is it successful " , outcome.isSuccess)
  println("is it a failure " , outcome.isFailure)

  outcome match {
    case Success(value) => println("it is a successful computation ", value)
    case Failure(e) => println("it is a unsuccessful computation ", e.getMessage)
  }

  def StringToInt(string: String) : Either[String, Int] = {
    try {
      Right(string.toInt)
    } catch {
      case error: NumberFormatException => Left("Error: " +error.getMessage)
    }
  }

  var result = StringToInt("5")
  println(result)
  result = StringToInt("hello")

  def dividingByZero(number: Int): Either[String, Int] = {
    try {
      Right(number / 0)
    } catch {
      case error: Exception => Left("Error: " + error.getMessage)
    }
  }

  result = dividingByZero(5)
  println(result)
  result = dividingByZero(0)
  println(result)

  val expression = Set("Good Morning", "Good Afternoon", "Good Evening", "Good Night")

  expression.foreach {
    case "Good Morning" => println("it is in the morning")
    case "Good Afternoon" => println("It is in the afternoon")
    case "Good Evening" => println("It is in the evening")
    case _ => println("not sure what time of the day it is")
  }


}
