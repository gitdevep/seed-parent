package cn.chenyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description:
 * @author: chenyh
 * @time: 2020/3/18 16:46
 */
@SpringBootApplication
@MapperScan("cn.chenyh.mapper.*")
@EnableSwagger2
public class OrderApplication {

  public static void main(String[] args) {
    SpringApplication.run(OrderApplication.class, args);
  }
}
