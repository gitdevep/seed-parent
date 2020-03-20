package cn.chenyh.controller;

import cn.chenyh.common.result.Response;
import cn.chenyh.common.result.Result;
import cn.chenyh.service.OrderService;
import cn.chenyh.vo.Order;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 订单Controller
 * @author: chenyh
 * @time: 2020/3/18 16:50
 */
@Slf4j
@Api("订单")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

  private final OrderService orderService;

  @ApiOperation("新增订单")
  @PostMapping
  public Result add(@RequestBody @Validated Order order) {
    log.info("新增订单={}", JSON.toJSON(order));
    orderService.add(order);
    return Response.success();
  }

  @ApiOperation("删除订单")
  @DeleteMapping("/{id}")
  public Result<Boolean> del(@NotNull @PathVariable("id") String id) {
    orderService.delete(id);
    return Response.success();
  }

  @ApiOperation("修改订单")
  @PutMapping
  public Result<Order> update(@Validated Order order) {
    orderService.update(order);
    return Response.success();
  }

  @ApiOperation("详细订单")
  @GetMapping("/{id}")
  public Result<Order> query(@NotNull @PathVariable("id") String id) {
    return Response.success(orderService.query(id));
  }

  @ApiOperation("订单分页列表")
  @GetMapping
  public Result<List<Order>> list() {
    return Response.success(orderService.queryList());
  }

}
