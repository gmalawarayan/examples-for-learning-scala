import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object ScalaFutureAndPromise extends App {

  val future = Future {
    Thread.sleep(1);
    21 + 21
  }
  println(s"Has the Future completed:? ${future.isCompleted}")
  println(s"Has the Future completed:? $future")

  private def printNumbersThatAreEven(): Unit = {
    println("Print all numbers that are even between 1 and 10000 ")
    (1 to 10000)
      .foreach(i => if (i % 2 == 0)
        print(s" ${i}"))
  }

  println(s"Has the Future completed:? ${future.isCompleted}")
  println(s"Has the Future completed:? $future")
}