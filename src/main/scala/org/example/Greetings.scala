package org.example

object Greetings {

  def main(args: Array[String]): Unit = {
    val greetings = printGreeting()
    val addition = addSomeNumbers()

    println(greetings + " The addition is " + addition)
  }

  def printGreeting(): String =
    "Hello world!"

  def addSomeNumbers(): Int =
    5 + 6

}
