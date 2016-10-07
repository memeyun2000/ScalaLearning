package main.scala.study.chapter3

import java.util

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Administrator on 2016/10/6.
  * 常用算法
  */
object Action5 {
  def main(args: Array[String]): Unit = {
    //求和
    println(Array(1, 7, 2, 8).sum)

    //求数组缓冲中的最大值
    println(ArrayBuffer("xixi", "hhehe", "hello world").max)

    //排序
    val b = ArrayBuffer(9, 7, 5, 3)
    //升序
    val bSorted = b.sortWith(_ < _)

    val bDescSorted = b.sortWith(_ > _)

    println(bSorted)
    println(bDescSorted)


    //--------------------
    // 可以直接对数组进行排序，数组缓冲不行，数组缓冲的排序只会产生一个新的对象
    val a = Array(2,3,4,5,6,4)
    scala.util.Sorting.quickSort(a)
    //显示数组内容
    for(x <- a)  print(x + ",")
    println()
    //另一种显示方法
    println(a.mkString(" and  "))


    
  }
}
