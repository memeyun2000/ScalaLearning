package main.scala.study.chapter4

/**
  * Created by Administrator on 2016/10/7.
  * 迭代映射
  */
object Action4 {
  def main(args: Array[String]): Unit = {
    //for((k,v) <- 映射)
    val scores3 = Map(("Alice", 6), ("Bob", 3), ("Cindy", 4))
    for((k,v) <- scores3) println("key:" + k + " , value:" + v)


    //迭代key
    for(k <- scores3.keySet) println("key:" + k)

    //迭代value
    for(v <- scores3.values) println("value:" + v)
  }
}
