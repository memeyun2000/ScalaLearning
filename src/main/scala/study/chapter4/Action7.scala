package main.scala.study.chapter4

/**
  * Created by Administrator on 2016/10/25.
  * 元组
  */
object Action7 {
  def main(args: Array[String]): Unit = {
    //t 的数据类型为Tuple3[String , Double , Int]
    val t = ("3",3.14,3)
    //使用_1 _2 _3访问元组 组元
    val second = t._2

    //使用模式匹配来获取 元组的 组元
    val (first,second2,third) = t

    //如果不是所有的 组元 都需要 则可以使用 _ 忽略
    val (first3 , second3 , _) = t

    //元组可以用于 当函数返回不止一个值得情况
    //例如 StringOps 的 partition 方法返回的是一对字符串，分别是满足条件的 和 不满足条件的
    val t2 = "Hello World".partition(_.isUpper)

    //返回 "HW" "ello orld"
    println(t2)
  }
}
