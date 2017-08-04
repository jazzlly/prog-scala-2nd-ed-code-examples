package progscala2.c001basic

/**
  * Created by ryanjiang on 2017/8/4.
  */
object CurryingDemo extends App {

  def modN(n: Int)(x: Int) = x % n

  // def mod5 = modN(5) // compile error
  // println(mod5(24))
  def abc(f: Int => Int, x: Int) = f(x)
  println(abc(modN(5), 27))

}
