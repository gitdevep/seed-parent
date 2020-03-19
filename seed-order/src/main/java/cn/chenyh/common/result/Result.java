package cn.chenyh.common.result;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 返回结果
 * @author: chenyh
 * @time: 2020/3/18 13:58
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {


  private Integer code;

  private boolean success;

  private String message;

  private T result;

  /**
   * 判断是否是成功结果 JsonIgnore使之不在json序列化结果当中
   *
   * @return 是否为成功结果
   */
  public boolean isSuccess() {
    return ResultEnum.SUCCESS.getCode() == this.code;
  }
}
