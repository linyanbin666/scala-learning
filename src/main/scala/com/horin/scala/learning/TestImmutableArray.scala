package com.horin.scala.learning

object TestImmutableArray {

  def main(args: Array[String]): Unit = {
    val arr1 = Array(1, 2, 3)
    val arr2 = 0 +: arr1 :+ 4
    println(arr1.mkString(","))
    println(arr2.mkString(","))
  }

}
