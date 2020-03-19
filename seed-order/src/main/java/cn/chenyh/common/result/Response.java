package cn.chenyh.common.result;

import cn.chenyh.common.exception.BusinessException;

/**
 * @descriptiona:
 * @author: chenyh
 * @time: 2020/3/18 13:55
 */
public class Response {

  /**
   * 生成返回结果
   *
   * @param code 返回编码
   * @param message 返回消息
   * @param result 返回数据
   * @param <T> 返回数据类型
   * @return 返回结果
   */
  public static <T> Result<T> generate(final int code, final String message, T result) {
    return new Result<>(code, false, message, result);
  }

  /**
   * 操作成功响应结果， 默认结果
   *
   * @return 操作成功的默认响应结果
   */
  public static <T> Result<T> success() {
    return new Result<>(ResultEnum.SUCCESS.getCode(), true, ResultEnum.SUCCESS.getMessage(), null);
  }

  public static <T> Result<T> success(final T result) {
    return new Result<T>(
        ResultEnum.SUCCESS.getCode(),
        true,
        ResultEnum.SUCCESS.getMessage(),
        result
    );
  }

  /**
   * 操作成功响应结果， 自定义数据及信息
   *
   * @param message 自定义信息
   * @param result 自定义数据
   * @param <T> 自定义数据类型
   * @return 响应结果
   */
  public static <T> Result<T> success(final String message, final T result) {
    return new Result<>(ResultEnum.SUCCESS.getCode(), true, message, result);
  }

  /**
   * 操作成功响应结果，自定义信息，无数据
   *
   * @param message 自定义信息
   * @return 响应结果
   */
  public static <T> Result<T> success4Message(final String message) {
    return new Result<>(ResultEnum.SUCCESS.getCode(), true, message, null);
  }

  /**
   * 操作失败响应结果， 默认结果
   *
   * @return 操作成功的默认响应结果
   */
  public static <T> Result<T> failure() {
    return new Result<>(ResultEnum.FAIL.getCode(), false, ResultEnum.FAIL.getMessage(), null);
  }

  /**
   * 操作失败响应结果， 自定义错误编码及信息
   *
   * @param code 自定义错误编码
   * @param message 自定义信息
   * @return 响应结果
   */
  public static <T> Result<T> failure(final int code, final String message) {
    return new Result<>(code, false, message, null);
  }

  /**
   * 操作失败响应结果， 自定义错误编码及信息
   *
   * @param code 自定义错误编码
   * @param message 自定义信息
   * @return 响应结果
   */
  public static <T> Result<T> failure(final int code, final String message, T result) {
    return new Result<>(code, false, message, result);
  }

  /**
   * 操作失败响应结果，自定义错误编码
   *
   * @param ResultENUM 自定义错误编码枚举
   * @return 响应结果
   */
  public static <T> Result<T> failure(final ResultEnum ResultENUM) {
    return new Result<>(ResultENUM.getCode(), true, ResultENUM.getMessage(), null);
  }

  /**
   * 操作失败响应结果，自定义信息
   *
   * @param message 自定义信息
   * @return 响应结果
   */
  public static <T> Result<T> failure(final String message) {
    return new Result<>(ResultEnum.FAIL.getCode(), false, message, null);
  }

  /**
   * 异常响应结果， 默认结果
   *
   * @return 操作成功的默认响应结果
   */
  public static <T> Result<T> error() {
    return new Result<>(ResultEnum.SERVER_ERROR.getCode(), false,
        ResultEnum.SERVER_ERROR.getMessage(), null);
  }

  /**
   * 异常响应结果， 自定义错误编码及信息
   *
   * @param code 自定义错误编码
   * @param message 自定义信息
   * @return 响应结果
   */
  public static <T> Result<T> error(final int code, final String message) {
    return new Result<>(code, false, message, null);
  }

  /**
   * 异常响应结果，自定义错误编码
   *
   * @param ResultENUM 自定义错误编码枚举
   * @return 响应结果
   */
  public static <T> Result<T> error(final ResultEnum ResultENUM) {
    return new Result<>(ResultENUM.getCode(), false, ResultENUM.getMessage(), null);
  }

  /**
   * 业务异常响应结果
   *
   * @param be 业务异常
   * @return 响应结果
   */
  public static <T> Result<T> error(final BusinessException be) {
    return new Result<>(ResultEnum.SERVER_ERROR.getCode(), false, be.getErrorMessage(), null);
  }

  /**
   * 异常响应结果，自定义信息
   *
   * @param message 自定义信息
   * @return 响应结果
   */
  public static <T> Result<T> error(final String message) {
    return new Result<>(ResultEnum.SERVER_ERROR.getCode(), false, message, null);
  }

}
