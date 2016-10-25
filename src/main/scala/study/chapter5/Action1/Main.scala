package main.scala.study.chapter5.Action1

/**
  * Created by Administrator on 2016/10/25.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    //调用无参的方法 可以 不使用 ()
    myCounter.increment

    println(myCounter.current)
  }
}
