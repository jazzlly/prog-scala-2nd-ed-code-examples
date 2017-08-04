package progscala2.c001basic

import scala.collection.mutable.ArrayBuffer

trait HairColor

trait Iterator[A] {
  def hasNext: Boolean
  def next : A
}

class IntIterator(val num: Int, var current : Int = 0) extends Iterator[Int] {
  override def hasNext: Boolean = current < num
  override def next: Int =  {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}

trait Pet {
  val name: String
}
class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet

object TraitDemo {
  def main(args: Array[String]): Unit = {
    println("test")

    val it = new IntIterator(5)
    println(it.next)
    println(it.next)
    println(it.next)

    val dog = new Dog("Harry")
    val cat = new Cat("Sally")
    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name))
  }
}

