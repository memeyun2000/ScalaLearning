package main.scala.spark.DataFrames

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}


/**
  * Created by Administrator on 2016/9/26.
  * read json
  * spark-version : 1.6.1
  */
object ReadJson {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("Read Json")
    conf.setMaster("local")

    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    val df = sqlContext.read.json("G:\\Intellij\\data\\people.json")

    df.show()

    df.printSchema()

    df.select("name").show()
  }
}
