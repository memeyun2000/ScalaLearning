package main.scala.study.chapter3

/**
  * Created by Administrator on 2016/9/26.
  * 定长数组
  */
object Action1 {
  def main(args: Array[String]): Unit = {
    //数组可以使用Array
    val nums = new Array[Int](10)
    //    十个值全部为0
    for (num <- nums) print(num + " ")

    println()

    //十个值全部为null
    val strs = new Array[String](10)
    for (str <- strs) print(str + " ")

    println()
    //    长度为w的Array[String] 类型是推断出来的
    val ss = Array("hello", "world")
    for (s <- ss) print(s + " ")

    //---说明：
    //    String数组在jvm中的实现是 java.lang.String[]
    //    基本类型在jvm中的实现基本类型数组 int[]
  }
}
