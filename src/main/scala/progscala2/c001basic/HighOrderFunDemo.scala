package progscala2.c001basic

/**
  * Created by ryanjiang on 2017/8/4.
  */
object HighOrderFunDemo extends App {

  def applyTo(f: Int => String, v: Int) = f(v)

  class Demo(left: String, right: String) {
    def layout[A](x: A) = left + x.toString + right
  }

  val demo = new Demo("[", "]")
  println(applyTo(demo.layout, 80))
}
