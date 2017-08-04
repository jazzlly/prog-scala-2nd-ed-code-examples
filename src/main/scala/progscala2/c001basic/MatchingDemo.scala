package progscala2.c001basic

import scala.util.Random


object MatchingDemo extends App {

  val x: Int = Random.nextInt(10)

  val str =  x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "any"
  }
  println(s"$x and $str")

  abstract class Notification
  case class Email(sender: String, title: String, body: String) extends Notification
  case class SMS(caller: String, message: String) extends Notification
  case class VoiceRecording(contactName:String, link: String) extends Notification

  def showNotification(notification: Notification) :String = {

    notification match {
      case Email(sender, title, _) =>
        s"You got an email from $sender with title $title"
      case SMS(caller, message) =>
        s"You got a SMS from $caller with message: $message"
      case VoiceRecording(contactName, link) =>
        s"You got a voice recording from $contactName"
    }
  }
  val email = Email("rui.jiang", "hello abc", "just for test")
  val sms = SMS("15011005932", "just for test")
  val vrd = VoiceRecording("rui.jiang", "www.baidu.com")
  println(showNotification(email))
  println(showNotification(sms))
  println(showNotification(vrd))
}
