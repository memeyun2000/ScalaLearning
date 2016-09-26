package main.scala.study.chapter3

/**
  * Created by Administrator on 2016/9/26.
  * 遍历数组和缓冲
  */
object Action3 {
  def main(args: Array[String]): Unit = {
    //    util
    val arrays = Array(10, 2, 3, 4)

    for (a <- 0 until arrays.length) print(a)
    println()

    //    for增强版
    for (a <- arrays) print(a)
    println()

    //    to
    for (a <- 0 to arrays.length - 1) print(a)
    println()

    //    跳着 遍历
    for (a <- 0 until(arrays.length, 2)) print(a)
  }
}
