package cn.chenyh;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description:
 * @author: chenyh
 * @time: 2020/3/19 11:26
 */
@EnableSwagger2
@EnableDubbo
@SpringBootApplication
//@EnableKafka
public class ConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerApplication.class, args);
  }
}

