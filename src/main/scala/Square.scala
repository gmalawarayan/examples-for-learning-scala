import Square.calculateArea

class Square {
  var length = 0
  def setLength(lengthFromInput :Int ): Unit = {
    length = lengthFromInput
  }
  println(calculateArea(length))
}

object Square {
  var length = 0
  def calculateArea(length : Int) = {
    print(s"if ($length > 0 ) 4 * $length else $length")
  }
}