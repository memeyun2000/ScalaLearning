package main.scala.study.chapter3

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Administrator on 2016/9/26.
  * 变长数组：数组缓冲
  * ArrayBuffer
  */
object Action2 {
  def main(args: Array[String]): Unit = {
    //    java 有ArrayList C++ 有Vector Scala有ArrayBuffer
    val b = new ArrayBuffer[Int]
    //    同时也可以写为如下：
    val a = ArrayBuffer[Int]()

    //    ArrayBuffer 添加一个数组元素
    b += 1 //ArrayBuffer(1)
    b += (3, 4, 5, 67) //ArrayBuffer(1,3,4,5,67)

    //打印
    for (value <- b) print(value + " ")
    println()

    //    添加集合
    b ++= b
    for (value <- b) print(value + " ")
    println()


    //    移除最后3个元素
    b.trimEnd(3)
    for (value <- b) print(value + " ")
    println()

    //---注意：
    //    在数组缓冲结尾处添加或删除一个元素是一个"高效"操作
    //    在数组任意位置插入元素 是一个"低效"操作    -----之后的所有元素都需要平移
    b.insert(2, 100)
    for (value <- b) print(value + " ")
    println()

    //    移除第二个元素
    b.remove(2)
    for (value <- b) print(value + " ")
    println()

    //从第二个元素开始移除三个元素
    b.remove(2, 3)
    for (value <- b) print(value + " ")
    println()

    //    使用数组缓冲后可以再构建数组
    b.toArray
    //    同时需要构建数组缓冲
    b.toBuffer
  }
}
