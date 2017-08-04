package progscala2.c001basic

class Abc (arg1: String, arg2: String) {
  println(s"arg1: $arg1, arg2: $arg2");
}

class Point(var x: Int, var y: Int) {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
  override def toString: String = s"($x, $y)"
}

object ClazzBasic {
  def main(args: Array[String]): Unit = {
    new Abc("hello", "world")

    val p1 = new Point(1, 2)
    p1.move(2, 2)
    println(p1.toString)
  }
}


