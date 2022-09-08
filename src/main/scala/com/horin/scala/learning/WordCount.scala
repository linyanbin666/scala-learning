package com.horin.scala.learning

object WordCount {

  def main(args: Array[String]): Unit = {
    wordCount1()
    wordCount2()
  }

  def wordCount1(): Unit = {
    val lines = List("hello world", "hello scala", "hello horin", "learning scala")
    val result: List[(String, Int)] = lines.flatMap(_.split(" "))
      .groupBy(word => word).map(kv => (kv._1, kv._2.length))
      .toList.sortWith(_._2 > _._2)
    println(result)
  }

  def wordCount2(): Unit = {
    val lines = List(("hello world", 1), ("hello scala", 1), ("hello horin", 1), ("learning scala", 1))
    val result: List[(String, Int)] = lines.flatMap(kv => kv._1.split(" ").map(word => (word, kv._2)))
      .groupBy(_._1)
      .mapValues(tupleList => tupleList.map(_._2).sum)
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
    println(result)
  }

}
