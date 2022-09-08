package com.horin.scala.learning

object TestTraitSelfType {

  def main(args: Array[String]): Unit = {
    val registerUser = new RegisterUser("horin", "123")
    registerUser.insert()
  }

  class User(val name: String, val password: String)

  trait UserDao {
    _: User =>

    def insert(): Unit = println(s"insert user: ${this.name} into db")
  }

  class RegisterUser(name: String, password: String) extends User(name, password) with UserDao

}

