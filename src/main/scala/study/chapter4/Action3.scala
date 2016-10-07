package main.scala.study.chapter4

/**
  * Created by Administrator on 2016/10/7.
  * 更新映射中的值
  */
object Action3 {
  def main(args: Array[String]): Unit = {
    val scores = scala.collection.mutable.Map(("Alice", 6), ("Bob", 3), ("Cindy", 4))
    println(scores("Bob"))

    //更改映射的值
    scores("Bob") = 86
    println(scores("Bob"))

    //添加元素
    scores += (("Bob", 10), ("Helly", 20))
    println(scores)

    //移除某个键
    scores -= "Alice"
    println(scores)

    //不可更新的映射如果要添加新元素，只能重新创建
    val scores3 = Map(("Alice", 6), ("Bob", 3), ("Cindy", 4))
    val newScores3 = scores3 + (("Bob", 10), ("Helly", 20))

    //也可以携程var
    var scores2 = Map(("Alice", 6), ("Bob", 3), ("Cindy", 4))
    scores2 = scores2 + (("Bob", 10), ("Helly", 20))
    println(scores2)

    //但是 普通map 是不能更新的
    //    scores2("Bob") = 99

    //------------说明
    //普通map新增 减少元素 效率并不低，应为新旧map共享大部分结构
    scores2 = scores2 - "Alice"
    println(scores2)

  }
}
