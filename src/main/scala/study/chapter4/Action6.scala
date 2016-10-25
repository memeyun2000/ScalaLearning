package main.scala.study.chapter4

import scala.collection.JavaConversions.propertiesAsScalaMap
/**
  * Created by Administrator on 2016/10/25.
  * Java 互操作
  */
object Action6 {
  def main(args: Array[String]): Unit = {
    val prop:scala.collection.Map[String,String] = System.getProperties
    for(p <- prop) println(p)
  }
}
