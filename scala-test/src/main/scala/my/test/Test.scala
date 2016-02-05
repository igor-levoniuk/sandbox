package my.test

import my.test

import scala.collection.immutable.::

object Test extends App {

  def sum(a: Int, b: Int) = a + b

//  def plus10(a: Int) = sum(a, 10)
  def plus10: Int => Int = sum(_, 10)

  def sum2(a: Int)(implicit b: Int) = a + b

  implicit val b = 1
  println(sum2(1))

  class Foo(x: Int) {
     def doStuff(): Unit = {
       println(x)
     }
  }

  implicit def banana(x: Int): Foo = new Foo(x)

  1.doStuff()

  def div1(x: Int, y: Int): Option[Int] =
    if (y != 0) Some(x / y) else None

  def div2(x: Int, y: Int): Either[String, Int] =
    if (y != 0) Right(x / y) else Left("Division by zero")

  div2(4, 2).fold(println, println)
  div2(4, 0).fold(println, println)

}



