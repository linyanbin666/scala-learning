package com.horin.scala.learning

object TestTrait {

  def main(args: Array[String]): Unit = {
    val myFootBall = new MyFootBall
    // 菱形继承 MyFootBall -> Category -> Color -> Ball
    println(myFootBall.describe())
  }

  trait Ball {
    def describe(): String = "Ball"
  }

  trait Color extends Ball {
    var color: String = "Red"
    override def describe(): String = color + "-" + super.describe()
  }

  trait Category extends Ball {
    var category: String = "Foot"
    override def describe(): String = category + "-" + super.describe()
  }

  class MyFootBall extends Category with Color {
    override def describe(): String = super.describe()
  }

}
