package cn.chenyh

import cn.chenyh.conf.AppConf
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.spark.streaming.kafka010.{ConsumerStrategies, KafkaUtils, LocationStrategies}

object kafKaConsumer extends AppConf {

  private val brokers = "127.0.0.1:9092"

  def main(args: Array[String]): Unit = {
    val topics = Array("hello")
    val kafkaParams = Map[String, Object](
      "bootstrap.servers" -> brokers,
      "key.deserializer" -> classOf[StringDeserializer],
      "value.deserializer" -> classOf[StringDeserializer],
      "group.id" -> "test-consumer-group",
      "auto.offset.reset" -> "latest",
      "enable.auto.commit" -> (false: java.lang.Boolean)
    )
    val messages = KafkaUtils.createDirectStream[String, String](
      ssc,
      LocationStrategies.PreferConsistent,
      ConsumerStrategies.Subscribe[String, String](topics, kafkaParams)
    )
    val sumRdd = messages.map(x => {
      x.value()
    })
    sumRdd.print()

    ssc.start()
    ssc.awaitTermination()
  }
}
