import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object ScalaFutureOne extends App {

  private val productPrice = Future {Thread.sleep(10); 150}
  private val productTax = Future {Thread.sleep(10); 5.5 }

  Thread.sleep(40)
  private val finalPrice = for {
    price <- productPrice
    tax <- productTax
  } yield price + tax

  println(s"Price of the product is ${productPrice} and tax is ${productTax} and so finalPrice is ${finalPrice}")
  private val salaryOfX = Future {Thread.sleep(3); 7000}
  Thread.sleep(50)
  println(s"Salary of X if greater than 5000: ${salaryOfX.filter(salary => salary > 5000 )}")
}
