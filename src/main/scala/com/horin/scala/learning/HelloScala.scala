package com.horin.scala.learning

object HelloScala {

  def main(args: Array[String]): Unit = {
    val fun = (i: Int, s: String, c: Char) => !(i == 0 && s == "" && c == '0')
    println(fun(0, "", '0'))
    val func = (i: Int) => {
      s: String => c: Char => !(i == 0 && s == "" && c == '0')
    }
    println(func(0)("")('0'))
    // 柯里化
    def func2(i: Int)(s: String)(c: Char) = !(i == 0 && s == "" && c == '0')
    println(func2(0)("")('0'))
  }

}
