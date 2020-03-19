package cn.chenyh.common.exception;

import cn.chenyh.common.result.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: chenyh
 * @time: 2020/3/18 14:01
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusinessException extends RuntimeException {

  /**
   * 异常代码
   */
  private int errorCode = ResultEnum.SERVER_ERROR.getCode();
  /**
   * 异常信息
   */
  private String errorMessage;

  public BusinessException(String errorMessage) {
    this.errorCode = ResultEnum.SERVER_ERROR.getCode();
    this.errorMessage = errorMessage;
  }

  public BusinessException(String errorMessage, Throwable e) {
    super(errorMessage, e);
    this.errorCode = ResultEnum.SERVER_ERROR.getCode();
  }

  public BusinessException(int errorCode, String errorMessage, Throwable e) {
    super(errorMessage, e);
    this.errorCode = errorCode;
  }

}
