package main.scala.study.chapter2

/**
  * 默认参数 和 带名参数
  * Created by Administrator on 2016/9/25.
  */
object Action8 {

  def main(args: Array[String]): Unit = {
//    正常调用
    println(decorate("hello"))

//    指定参数名字的调用
    println(decorate("hello","<<<",">>>"))

//    按名称指定参数，调用函数 （其中一个参数未指定）
    println(decorate(str = "hello world",right = "[["))

//    按名称指定参数，调用函数
    println(decorate(str = "hello world", left = "***", right = "***"))
  }

  /**
    * 带默认值参数函数
    * @param str
    * @param left
    * @param right
    * @return
    */
  def decorate(str:String, left:String = "[", right:String = "]") = {
    left + str + right
  }

}
