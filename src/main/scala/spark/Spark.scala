package spark

import org.apache.spark.{SparkConf, SparkContext}

object Spark {

  def main(args: Array[String]) {
    val conf = new SparkConf()
      //.setMaster("mesos://localhost:5050")
      .setMaster("local")
      .setAppName("My app")
      //.set("spark.executor.uri", "/Users/admin/Working/spark-2.1.0-bin-hadoop2.7.tgz")
    val sc = new SparkContext(conf)

    val NUM_SAMPLES=1000
    val count = sc.parallelize(1 to NUM_SAMPLES).map{i =>
      val x = Math.random()
      val y = Math.random()
      if (x*x + y*y < 1) 1 else 0
    }.reduce(_ + _)
    println("Pi is roughly " + 4.0 * count / NUM_SAMPLES)
  }
}