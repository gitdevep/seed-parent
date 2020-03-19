package cn.chenyh.common.exception;

import cn.chenyh.common.result.Response;
import cn.chenyh.common.result.Result;
import cn.chenyh.common.result.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description:
 * @author: chenyh
 * @time: 2020/3/18 13:46
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

  /**
   * 用于处理参数校验错误
   *
   * @Validated校验失败时会抛出MethodArgumentNotValidException异常
   */
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public Result methodArgumentValidExceptionHandler(MethodArgumentNotValidException e)
      throws Exception {
    return Response.failure(ResultEnum.PARAMETER_ERROR);
  }


}
