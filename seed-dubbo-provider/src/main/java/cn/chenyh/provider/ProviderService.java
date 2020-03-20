package cn.chenyh.provider;

import cn.chenyh.IService;
import cn.chenyh.vo.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: chenyh
 * @time: 2020/3/19 11:31
 */
@Service
@RequiredArgsConstructor
@Slf4j
@Component
public class ProviderService implements IService {

  private final KafkaTemplate<String, String> kafkaTemplate;

  @Override
  public String iWorld(String name) {
    return sendSMS(name);
  }

  /**
   * 日志生成
   */
  public String sendSMS(String msg) {
    log.info("发送消息 ----->>>>>  message = {}", msg);
    String userInfo = User.builder()
        .birthday("1991-09-21")
        .idCard("511304199110101234")
        .name("李四")
        .phoneNo("12345678922").toString();
    kafkaTemplate.send("hello", userInfo);
    return userInfo;
  }

}
