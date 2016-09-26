package main.scala.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by Administrator on 2016/9/26.
  */
object WordCount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("MY frist Spark App")
    conf.setMaster("local")

    var sc = new SparkContext(conf)

    //    val lines = sc.textFile("G:\\scalaEclipse\\data\\abc.txt", 1)
    //
    //    val words = lines.flatMap { line => line.split(",") }
    //
    //    val pairs = words.map { word => (word, 1) }
    //
    //    val WordCount = pairs.reduceByKey(_ + _)

    val WordCount = sc.textFile("G:\\scalaEclipse\\data\\abc.txt", 1).flatMap(line => line.split(",")).map(word => (word, 1)).reduceByKey(_ + _);

    WordCount.foreach(wordNumberPair => println(wordNumberPair._1 + ":" + wordNumberPair._2))

    sc.stop()
  }
}
