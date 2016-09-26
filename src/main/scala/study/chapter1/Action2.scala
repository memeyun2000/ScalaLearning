package main.scala.study.chapter1

/**
  * Created by Administrator on 2016/9/23.
  * scala 声明和变量
  */
object Action2 {
  def main(args: Array[String]): Unit = {
//    声明整型变量
    val answer = 8 * 5 + 2

//    val 实际上定义的是一个常量，不可以更改val声明的值
//    answer = 0

//    如果要声明可变的变量，可以用var
    var counter = 0
    counter = 1
//-----------注意：
//     scala鼓励使用val，大多数程序并不需要那么多的var变量

//    scala会根据初始的表达式判断“变量”或“值”的类型
//    声明“值”或“变量”不初始化会报错
//    val xxx

//    在必要的时候，可以指定对象的类型
    val greeting: String = null
    val greetCount: Any = "hello world"


  }
}
