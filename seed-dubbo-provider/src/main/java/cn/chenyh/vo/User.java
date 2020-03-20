package cn.chenyh.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: chenyh
 * @time: 2020/3/20 13:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

  /**
   * 姓名
   */
  private String name;

  /**
   * 生日
   */
  private String birthday;

  /**
   * 身份证
   */
  private String idCard;

  /**
   * 手机号
   */
  private String phoneNo;
}
