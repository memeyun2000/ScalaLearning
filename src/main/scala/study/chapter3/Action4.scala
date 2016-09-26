package main.scala.study.chapter3

/**
  * Created by Administrator on 2016/9/26.
  * 数组转换
  */
object Action4 {
  def main(args: Array[String]): Unit = {
    //    每个元素 *2
    val arrays = Array(2, 3, 5, 2, 1)

    val result = for (elem <- arrays) yield 2 * elem

    for (res <- result) print(res)
    println()

    //    等同
    val result2 = arrays.map(a => a * 2)
    for (res <- result2) print(res)
    println()


    //---    过滤后转换
    val result3 = for (elem <- arrays if elem > 3) yield 2 * elem
    for (res <- result3) print(res)
    println()
    //    等同
    val result4 = arrays.filter(e => e > 3).map(e => e * 2)
    for (res <- result4) print(res)
  }
}
