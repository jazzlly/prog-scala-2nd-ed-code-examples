package progscala2.c001basic


abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next(): T
}

class StringIterator(val string: String) extends AbsIterator {
  var current = 0;
  val len = string.size

  override type T = Char

  override def hasNext: Boolean = current < len

  override def next() = {
    if (hasNext) {
      val c = string.charAt(current)
      current += 1
      c
    } else {
      throw new IllegalStateException("has no element")
    }
  }
}

trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit) : Unit = while (hasNext) f(next())
}

object test extends App {
//  val si = new StringIterator("Hello world!")
//  while (si.hasNext) {
//    println(si.next())
//  }

  class Iter extends StringIterator("Hello mixins") with RichIterator;
  val iter = new Iter
  iter.foreach(println(_))

}
