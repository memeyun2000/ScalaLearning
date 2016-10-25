package main.scala.study.chapter5.Action2

/**
  * Created by Administrator on 2016/10/25.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val person = new Person

    //调用 Setter 方法
    person.age = 2

    //调用getter 方法
    // 实际上调用的是 age_=(int) 方法
    println(person.age)
  }
}
