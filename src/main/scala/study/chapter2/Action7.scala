package main.scala.study.chapter2

/**
  * Created by Administrator on 2016/9/25.
  * 函数
  */
object Action7 {
  def main(args: Array[String]): Unit = {
//    实验函数 "abs"
//    print(abs(-2))


//    实验函数 "fac"
//    print(fac(6))

//    实验函数 returnFac
//    returnFac(0)

//    实验递归函数 retFac 递归函数是需要指定返回值类型的
    println(retFac(3))
  }
  /**
    * 只要函数不是递归就不需要指定返回类型
    * @param x
    * @return
    */
  def abs(x:Double)= if (x > 0) x else -x

  /**
    * 函数最后一个表达式的值 即 函数的返回值
    * @param n
    * @return
    */
  def fac(n:Int) = {
    var r = 1
    for(i <- 1 to n ) {
      r = r + n
    }

    r
  }

  /**
    * return 并不是不能使用。
    * return 反而作为函数的break应更常用
    * @param x
    */
  def returnFac(x:Int): Unit = {
    if ( x == 0 ) return

    println(x)
  }

  /**
    * 指定了返回值类型为"Int"
    * 递归函数需要指定函数的返回值
    * @param x
    * @return
    */
  def retFac(x:Int): Int = {
    if ( x <=0 ) {
      1
    } else {
      x * retFac( x - 1)
    }
  }
}
