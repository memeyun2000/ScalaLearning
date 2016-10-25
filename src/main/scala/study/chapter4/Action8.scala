package main.scala.study.chapter4

/**
  * Created by Administrator on 2016/10/25.
  *
  * 拉链操作
  */
object Action8 {
  def main(args: Array[String]): Unit = {
    val symbols = Array("<" ,"-" ,">")
    val counts = Array(2,10,2)
    //拉链操作
    val pairs = symbols.zip(counts)
    //输出对偶数组
    for((a1, a2) <- pairs) print(a1 * a2)
  }
}
