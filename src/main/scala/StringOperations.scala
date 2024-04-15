object StringOperations extends App{

  val str : String = "I am learning scala";
  println(str.charAt(2))
  println(str.substring(7,10))
  println(str.split(' ').toList)
  println(str.startsWith("I a"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length())

  //scala's own utilities
  val numberString : String = "123456"
  println(numberString.toInt)


}
