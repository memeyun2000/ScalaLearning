package main.scala.study.chapter4

/**
  * Created by Administrator on 2016/10/7.
  * 构造映射
  */
object Action1 {
  def main(args: Array[String]): Unit = {
    //Map() 构造的是一个不可变的映射
    val scores = Map("Alice" -> 10 , "Bob" -> 3, "Cindy" -> 8)
    println(scores)

    //构造可变的映射
    val scoreses = scala.collection.mutable.Map("Alice" -> 3, "Bob" -> 4, "Cindy" -> 5)
    println(scoreses)

    //另一种构造映射的方式
    val sc = Map(("Alice",6),("Bob",3),("Cindy",4))
    println(sc)

  }
}
