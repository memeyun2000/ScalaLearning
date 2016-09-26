package main.scala.study.chapter1

/**
  * Created by Administrator on 2016/9/23.
  * 算术和操作符重载
  */
object Action4 {
  def main(args: Array[String]): Unit = {
//    操作符实际方法
    1 + 2
    1.+(2)

//    又如：
    1.to(10)    //显示写法
    1 to 10     //隐式写法
//-----说明：
//    采用哪种写法，取决于哪种写法更可读


//    和java、c++ 不同，scala没有 ++ -- 操作符
//    需要使用 +=1 -=1
    var counter = 0
    counter += 1

//    BigInt 和 BigDecimal 可以使用常规的方法操作数学计算
//    不像java 需要使用 x.multiply(x)
    var x:BigInt = 9839384
    x * x * x

//-------注意：
//    scala允许定义重载操作符，而java不允许
  }
}
