package com.horin.scala.learning

import scala.annotation.tailrec

object Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5, 1))
    var n = 10
    myWhile(n >= 1){
      println(n)
      n -= 1
    }
  }

  def fact(n: Int): Int = {
    if (n == 0) {
      1
    } else {
      n * fact(n - 1)
    }
  }

  @tailrec
  def tailFact(n: Int, res: Int): Int = {
    if (n == 0) {
      res
    } else {
      tailFact(n - 1, res * n)
    }
  }

  def myWhile(condition: =>Boolean)(op: =>Unit): Unit = {
    if (condition) {
      op
      myWhile(condition)(op)
    }
  }

}