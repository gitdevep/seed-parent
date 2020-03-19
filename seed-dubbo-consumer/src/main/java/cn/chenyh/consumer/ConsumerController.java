package cn.chenyh.consumer;

import cn.chenyh.IService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: chenyh
 * @time: 2020/3/19 11:28
 */
@Slf4j
@Api("消费者")
@RestController
@RequestMapping("/api/consumer")
public class ConsumerController {

  @Reference
  private IService service;

  @ApiOperation("消费")
  @GetMapping("/{id}")
  public String consumer(@NotNull @PathVariable("id") String id) {
    return service.iWorld(id);
  }

}
