package main.scala.study.chapter2

import java.text.MessageFormat

/**
  * 变长参数
  * Created by Administrator on 2016/9/25.
  */
object Action9 {

  def main(args: Array[String]): Unit = {
    println(sum(1,2,3,4,5,6))

//    sum(1,2,3,4,5) 参数得到是一个类型为"Seq"的参数
//    所以如下调用时错误的
//    sum(1 to 5)

//    如果要使用如上的调用方式需要添加
    sum(1 to 5 :_*)
//    这种调用方式在 递归 中使用变长参数 是 "必须的"


//    使用java的带有变长参数的 函数时，参数需要使用"asInstanceOf"来转换参数
//    如下：42.asInstanceOf[Integer]           42.asInstanceOf[AnyRef]
    val str = MessageFormat.format("The answer to {0} is {1}","everything", 42.asInstanceOf[Integer])
    println(str)
  }

  /**
    * 声明变产参数的函数
    * @param args
    */
  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) {
      result += arg
    }
    result
  }

  /**
    * 带有变长参数的递归函数
    * @param args
    * @return
    */
  def recursiveSum(args:Int*):Int = {
    if (args.length <= 0 ) 0 else args.head + recursiveSum(args.tail:_*)
  }
}
