package main.scala.study.chapter1

/**
  * Created by Administrator on 2016/9/23.
  * 常用类型
  */
object Action3 {
  def main(args: Array[String]): Unit = {

//    数据类型：Byte Char Short Int Long Float Double Boolean
//    scala不刻意区分“基本类型”和“引用类”
    1.toString()

//    更有意思的是
    1.to(10)  //产出Range(1,2,3,4,5...9,10)

//    scala使用java底层的java.lang.String()类表示字符串
//    不过，它通过StringOps类给字符串加了上百种方法
//    intersect(String) 方法在java中没有实现
    "hello".intersect(" world")  //在这个表达式中“hello” 被隐式转换成了 StringOps 对象

//    同样scala提供了RichInt, RichDouble ,RichChar等，如
    1.to(10) //Int值1 首先被转换成RichInt 再调用 to() 方法

//---------------说明：
//    在scala中使用“方法”而不是“强制类型转换”来做数值类型之间的转换
//    例如：
    99.9.toInt  //得到99
    99.toChar   //得到'c'
    99.4.toString
    "99.4".toDouble
//    和java一样toString()将任意对象转换为字符串
  }
}
