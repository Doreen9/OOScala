package io.turntabl.student

class tryExample(firstmessage: String, secondmessage: String) {
  def this(firstmessage: String) = this(firstmessage, "yoooooo")

  def fullmessage = s"$firstmessage, $secondmessage"

}

object tryExample{
  def apply(firstmessage: String, secondmessage: String): tryExample = new tryExample(firstmessage, secondmessage)

}
object MyTryApp extends App{

  val example = new tryExample("Greetings", "nooooooo")
  print(example.fullmessage)
}