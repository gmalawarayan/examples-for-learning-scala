println("hello world")

val testing = 100

if (testing > 10) {
  println(s"Value is greater than 10 and the Value is  $testing" )
}

def sumOfTwoNumbers(number1 :Int, number2 :Int) : Int = {
  number1 + number2
}

sumOfTwoNumbers(2,3)

def sumUpTwoIfTheyArePrime(number1 :Int, number2: Int) : Int = {
  if (number1 / number1 == 1 && number2 / number2 == 1) {
    number1 + number2
  }
  0
}

sumUpTwoIfTheyArePrime(2,3)

def something(number1 :Int, number2: Int) : Int = {
  if(number1 > number2) number1
  number2
}

something(2,3)
