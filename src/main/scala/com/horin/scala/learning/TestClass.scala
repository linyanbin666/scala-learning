package com.horin.scala.learning

import scala.beans.BeanProperty

object TestClass {

  def main(args: Array[String]): Unit = {
    val student = new Student()
    println(student.name)
    println(student.age)
    student.name = "Horin"
    student.age = 25
    println(student.getName)
    println(student.age)
  }

  class Student(var gender: String) {
    @BeanProperty
    var name: String = _
    var age: Int = _
    def this() {
      this("男")
    }
  }

}
