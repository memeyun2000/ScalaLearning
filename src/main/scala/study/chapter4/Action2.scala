package main.scala.study.chapter4

/**
  * Created by Administrator on 2016/10/7.
  * 获取映射中的值
  */
object Action2 {
  def main(args: Array[String]): Unit = {
    val scores = Map(("Alice", 6), ("Bob", 3), ("Cindy", 4))
    println(scores)

    val bobScore = scores("Bob")
    println(bobScore)

    //如果映射中不包含请求的键，则会报错
    //    scores("sc")

    //不想报错可以检查元素是否存在
    val bobScore2 = if (scores.contains("Bob")) scores("Bob") else 0
    println(bobScore2)
    //简洁的写法
    val bobScore3 = scores.getOrElse("Bob",0)
    println(bobScore3)

  }
}
