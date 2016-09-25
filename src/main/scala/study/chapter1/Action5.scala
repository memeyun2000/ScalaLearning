package main.scala.study.chapter1

import scala.math._
import scala.util.Random

/**
  * Created by Administrator on 2016/9/23.
  * 调用函数和方法
  */
object Action5 {
  def main(args: Array[String]): Unit = {
//    scala使用数学函数，不需要从某个类调用静态方法
//    需要引入 scala.math._ "_" 代表通配符
    sqrt(23)

//    scala 没有“静态方法”，但是有“单例对象” 第六章详细介绍
//    scala 一个类对应有一个“伴生对象”，类似java中的静态方法

//    伴生对象
//    BigInt 的伴生对象 probablePrime  和 java的静态方法调用很相似
//    这里Random是单例对象（也是使用单例对象比使用类对象好的，为数不多的场景）
    BigInt.probablePrime(100,Random)


    //    不带参数的方法一般不需要写 "()"
    "hello".distinct
  }
}
