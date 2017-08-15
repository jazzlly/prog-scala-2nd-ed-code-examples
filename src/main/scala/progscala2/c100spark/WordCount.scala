package progscala2.c100spark

import java.io.InputStream
import java.util

import org.apache.spark.{SparkConf, SparkContext}


/**
  * Created by ryanjiang on 2017/8/15.
  */
object WordCount {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("word count").setMaster("local")
    val context = new SparkContext(conf)

    val filePath = s"${System.getProperty("user.dir")}/src/main/resources/README.md"
    val textFile = context.textFile(filePath)

    1.to(10).foreach(println(_))

    println(textFile.count())

    val linePython = textFile.filter(_.contains("Python"))
    println(linePython.count())
    linePython.collect().foreach(println(_))

    context.stop()

  }
}
