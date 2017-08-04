/**
  * Created by ryanjiang on 2017/7/21.
  */

object Basic {
  val abc = "abc"
  println(abc)

  1.to(10).foreach((x) => println(x))
  1.to(10).foreach(println(_))

  // Any and Nothing ()
  val a = 10
  val s: Any = if (a > 5) "test" else 20
  val ss = if (a > 5) "abc"
  val sss = if (a > 50) "abc"
  println(s)
  println(ss)
  println(sss)

  // basic function
  def abs(x: Double): Double = {
    if (x >= 0) x else -x;
  }

  println(abs(0))
  println(abs(-3))
  println(abs(3))

  // default param
  def addBracklet(content: String, left: String = "[", right: String = "]"): String = {
    left + content + right
  }

  println(addBracklet(abc))

  //
  def sum(numbers: Int*): Int = {
    var total: Int = 0;
    numbers.foreach(i => total += i)
    total
  }

  val abcd : Double = 1234
  // var test123: Double = null   // compile error
  val testCaseClass: TestCaseDemo = null
  println(testCaseClass)

  val emptyList = Nil
  println(emptyList)

  def exit = sys.exit()
  println(exit)

  def main(args: Array[String]): Unit = {
  }
}

case class TestCaseDemo(val foo: String, val bar: String)
