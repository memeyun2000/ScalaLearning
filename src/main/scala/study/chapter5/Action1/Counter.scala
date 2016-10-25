package main.scala.study.chapter5.Action1

/**
  * Created by Administrator on 2016/10/25.
  * 简单类 和 无参方法
  */
class Counter {
  private var value = 0
  def increment() { value += 1}

  //可以写成： def current = value
  def current() {value}
}
