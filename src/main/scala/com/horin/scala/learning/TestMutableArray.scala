package com.horin.scala.learning

import scala.collection.mutable.ArrayBuffer

object TestMutableArray {

  def main(args: Array[String]): Unit = {
    // 1 2 3
    val arrayBuffer = ArrayBuffer(1, 2, 3)
    println(arrayBuffer)
    // 1 2 3 4
    arrayBuffer += 4
    println(arrayBuffer)
    // 0 1 2 3 4
    0 +=: arrayBuffer
    println(arrayBuffer)
    // 0 1 2 3 4 5
    arrayBuffer.append(5)
    println(arrayBuffer)
    // -1 -1 0 1 2 3 4 5
    arrayBuffer.prepend(-1)
    arrayBuffer.prepend(-1)
    println(arrayBuffer)
    // -1 0 1 2 3 4 5
    arrayBuffer -= -1
    println(arrayBuffer)
  }

}
