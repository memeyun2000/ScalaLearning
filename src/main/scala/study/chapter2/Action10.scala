package main.scala.study.chapter2

/**
  * 过程 使用 :Unit = {} 表示无返回的函数
  * Created by Administrator on 2016/9/25.
  */
object Action10 {

  /**
    * 显式声明 无返回的函数
    * @param x
    */
  def fac1(x:Int): Unit = {

  }

  /**
    * 隐式声明 无返回的函数
    * 注意：（没有"="）
    * @param x
    */
  def fac2(x:Int) {

  }

  /**
    * 这个函数是有返回的函数
    * 注意：（这里有"="）
    * @param x
    */
  def fac3(x:Int) = {

  }
}
