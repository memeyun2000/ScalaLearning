package main.scala.study.chapter2

/**
  * Created by Administrator on 2016/9/24.
  * 高级循环
  */
object Action6 {
  def main(args: Array[String]): Unit = {
//    嵌套循环
    for(i <- 1 to 3 ; j <- 1 to 4) {
      print(i * 10 + j + " ")
    }
    println()

//     循环守卫
    for(i <- 1 to 3 ; j <- 1 to 4 if i!=j) {
      print(i * 10 + j + " ")
    }
    println

//    表达式中的变量
    for(i <- 1 to 3 ;from = 4 - i ; j <- from to 3) {
      print(1 * 10 + j + " ")
    }
    println

  }
}
