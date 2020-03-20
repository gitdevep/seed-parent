package cn.chenyh.conf

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.streaming.{Seconds, StreamingContext}

trait AppConf {

  val conf = new SparkConf().setAppName("logProcess").setMaster("local[*]")

  val spark = SparkSession.builder().config(conf).enableHiveSupport().getOrCreate()

  val sc = spark.sparkContext

  val ssc = new StreamingContext(sc, Seconds(5))

}
