case class Event(name: String, place: String, day: String, country: String)

object ScalaCollections extends App {

  private val aList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(s"List of numbers in the list is ${aList}")
  println(s"Sum of numbers in the list is ${aList.sum}")
  println(s"Minimum number in the list is ${aList.min}")
  println(s"Maximum number in the list is ${aList.max}")
  println(s"Product of numbers in the list is ${aList.product}")
  println(s"Length of numbers in the list is ${aList.length}")

  private val aSet = Set(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(s"List of numbers in the Set is ${aSet}")
  println(s"Sum of numbers in the Set is ${aSet.sum}")
  println(s"Minimum number in the Set is ${aSet.min}")
  println(s"Maximum number in the Set is ${aSet.max}")
  println(s"Product of numbers in the Set is ${aSet.product}")
  println(s"Length of numbers in the Set is ${aSet.size}")
  println(s"Numbers in the Set is greater than 5 ${aSet.filter(_ > 5)}")

  private val anotherList = List("Good Morning", "Good Afternoon", "Good Evening", "Good Night", "Good")
  println(s"List of strings in the list is ${anotherList}")
  println(s"Does the String Good in the list is ${anotherList.contains("Good")}")
  println(s"Minimum strings in the list is ${anotherList.min}")
  println(s"Maximum strings in the list is ${anotherList.max}")
  println(s"Length of strings in the list is ${anotherList.length}")

  private val listOfEvents = List(List(Event("Event 1", "Chicago", "1st", "USA"), Event("Event 2", "NewYork", "3rd", "USA")),
    List(Event("Event 3", "London", "4th", "UK"), Event("Event 4", "Manchester", "6th", "UK"))
  )

  private val listOfCountries = listOfEvents.flatMap(listOfEvent => listOfEvent.map(_.country))
  private val listOfDays = listOfEvents.flatMap(listOfEvent => listOfEvent.map(_.day))
  private val listOfPlaces = listOfEvents.flatMap(listOfEvent => listOfEvent.map(_.place))
  private val listOfEventsOrganised = listOfEvents.flatMap(listOfEvent => listOfEvent.map(_.name.replace("Event", "Extravaganza")))
  println(listOfCountries)
  println(listOfDays)
  println(listOfPlaces)
  println(listOfEventsOrganised)


}