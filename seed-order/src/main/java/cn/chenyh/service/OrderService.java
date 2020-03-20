package cn.chenyh.service;

import cn.chenyh.mapper.OrderMapper;
import cn.chenyh.vo.Order;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: chenyh
 * @time: 2020/3/18 21:10
 */
@Service
@RequiredArgsConstructor
public class OrderService {

  private final OrderMapper orderMapper;

  public int add(Order order) {
    return orderMapper.insert(order);
  }

  public int update(Order order) {
    return orderMapper.updateByPrimaryKeySelective(order);
  }

  public int delete(String id) {
    return orderMapper
        .updateByPrimaryKeySelective(Order.builder().orderId(id).state(new Byte("0")).build());
  }

  public Order query(String id) {
    return orderMapper.selectByPrimaryKey(id);
  }

  public List<Order> queryList() {
    return orderMapper.selectAll();
  }
}
