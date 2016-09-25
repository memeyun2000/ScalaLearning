package main.scala.study.chapter2

import java.io.IOException
import java.net.{MalformedURLException, URL}

/**
  * 异常
  * Created by Administrator on 2016/9/25.
  */
object Action12 {
  def main(args: Array[String]): Unit = {
    //和java类似
    try {
      new URL("")
    } catch {
      case _: MalformedURLException => println("")
      case ex: IOException => ex.printStackTrace()
    }
  }
}
