package main.scala.study.chapter4

import scala.collection.immutable.SortedMap

/**
  * Created by Administrator on 2016/10/25.
  * 已排序的映射，按照key进行排序
  */
object Action5 {
  def main(args: Array[String]): Unit = {
    val scores = SortedMap("Alice"-> 10,"Fred"->7,"Bob"->3,"Cindy"->8);

    println(scores)
  }
}
