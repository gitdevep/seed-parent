package cn.chenyh.vo;

import cn.chenyh.common.utils.AbstractVo.Add;
import cn.chenyh.common.utils.AbstractVo.Update;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "order_info")
public class Order {

  /**
   * 订单编号
   */
  @Id
  @Column(name = "order_id")
  @NotNull(groups = {Update.class}, message = "订单编号不能为空")
  private String orderId;

  /**
   * 商品编号
   */
  @Column(name = "goods_id")
  @NotNull(groups = {Add.class}, message = "商品编号不能为空")
  private String goodsId;

  /**
   * 单价
   */
  @NotNull(groups = {Add.class}, message = "单价不能为空")
  private Float price;

  /**
   * 数量
   */
  @NotNull(groups = {Add.class}, message = "数量不能为空")
  private Integer amount;

  /**
   * 状态
   */
  private Byte state = new Byte("0");

  /**
   * 创建时间
   */
  @DateTimeFormat
  @Column(name = "create_date")
  private Date createDate = new Date();

  /**
   * 创建人
   */
  @Column(name = "creat_by")
  private String creatBy = "chenyh";

  /**
   * 更新时间
   */
  @Column(name = "update_date")
  private Date updateDate = new Date();

  /**
   * 更新人
   */
  @Column(name = "update_by")
  private String updateBy = "chenyh";
}