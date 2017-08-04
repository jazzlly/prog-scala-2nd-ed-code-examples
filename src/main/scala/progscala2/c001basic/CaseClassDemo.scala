package progscala2.c001basic

/**
  * Created by ryanjiang on 2017/8/1.
  */

case class Book(isbn: String)
case class Message(sender: String, recipient: String, body: String)

object Book {
  def main(args: Array[String]): Unit = {
    val frankenstein = Book("978-0486282114")
    println(frankenstein)

    val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")
    println(message1.sender)  // prints guillaume@quebec.ca
    // message1.sender = "travis@washington.us"  // this line does not compile


    // comparison
    val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val messagesAreTheSame = message2 == message3  // true
    println(s"message are same: $messagesAreTheSame" )

    // copying
    val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
    val message5 = message4.copy(sender = "123", body = "muhaha")
    println(s"copied message is: $message5" )
  }
}
