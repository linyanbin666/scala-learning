package com.horin.scala.learning

object TestLazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(1, 2)
    println("1")
    println("2 " + result)
    println("2 " + result)
  }

  def sum: (Int, Int) => Int = {
    println("sum被调用")
    _ + _
  }

}
