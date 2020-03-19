package cn.chenyh.provider;

import cn.chenyh.IService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @description:
 * @author: chenyh
 * @time: 2020/3/19 11:31
 */
@Service
public class ProviderService implements IService {

  @Override
  public String iWorld(String name) {
    return name;
  }
}
