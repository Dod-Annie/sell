package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@DynamicUpdate
@Data
public class OrderMaster {

  private String orderId;
  private String buyerName;
  private String buyerPhone;
  private String buyerAddress;
  private String buyerOpenid;
  private BigDecimal orderAmount;
  private long orderStatus = OrderStatusEnum.NEW.getCode();
  private long payStatus = PayStatusEnum.WAIT.getCode();
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;

  @Id
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }


  public String getBuyerPhone() {
    return buyerPhone;
  }

  public void setBuyerPhone(String buyerPhone) {
    this.buyerPhone = buyerPhone;
  }


  public String getBuyerAddress() {
    return buyerAddress;
  }

  public void setBuyerAddress(String buyerAddress) {
    this.buyerAddress = buyerAddress;
  }


  public String getBuyerOpenid() {
    return buyerOpenid;
  }

  public void setBuyerOpenid(String buyerOpenid) {
    this.buyerOpenid = buyerOpenid;
  }


  public BigDecimal getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(BigDecimal orderAmount) {
    this.orderAmount = orderAmount;
  }


  public long getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(long orderStatus) {
    this.orderStatus = orderStatus;
  }


  public long getPayStatus() {
    return payStatus;
  }

  public void setPayStatus(long payStatus) {
    this.payStatus = payStatus;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}
