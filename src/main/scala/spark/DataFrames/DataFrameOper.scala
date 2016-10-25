package main.scala.spark.DataFrames

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext

/**
  * Created by Administrator on 2016/10/9.
  */
object DataFrameOper {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("Read Json")
    conf.setMaster("local")

    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    val df = sqlContext.read.json("G:\\Intellij\\data\\people.json")

    df.show()

    df.printSchema()

    //select only the "name" column
    df.select("name").show()

    //select everybody ,bug age increment by 1
    df.select(df("name"),df("age") + 1).show()

    //select people age > 20
    df.filter(df("age") > 20).show()

    //count people by age
    df.groupBy(df("age")).count().show()
  }
}
