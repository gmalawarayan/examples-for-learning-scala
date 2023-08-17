import scala.util.Random

object PatternMatchingExamples extends App {

  private val listOfOutComes = List(Car("Tesla"), Car("Ford"), Car("Nissan"), Car("Toyota"), Trip("Mumbai"), Trip("London"), Trip("Frankfurt"), Trip("Chennai"),
    NothingWon(), NothingWon(), NothingWon(), NothingWon(), CashPrice("£10"), CashPrice("£100000"), CashPrice("£100"), CashPrice("£10000")
  )

  luckDip()
  private def luckDip(): Unit = {
    val luckDip = Random.shuffle(listOfOutComes).take(1)(0)

    luckDip match {
      case t: Trip => println(s"You have won a trip to ${t.place}")
      case c: Car => println(s"You have won a car ==> ${c.carModel}")
      case ca: CashPrice => println(s"You have won a cash price of ${ca.cashAmount}")
      case n: NothingWon => println(s"Sorry, you have not won anything,  ${n.greeting}")
    }
  }

}

case class Car(carModel: String)
case class Trip(place: String)
case class NothingWon(greeting: String = "Better luck next time!!")
case class CashPrice(cashAmount: String)
