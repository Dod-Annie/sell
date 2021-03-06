package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class OrderDetail {

  @Id
  private String detailId;
  private String orderId;
  private String productId;
  private String productName;
  private double productPrice;
  private Integer  productQuantity;
  private String productIcon;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public String getDetailId() {
    return detailId;
  }

  public void setDetailId(String detailId) {
    this.detailId = detailId;
  }


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }


  public Integer  getProductQuantity() {
    return productQuantity;
  }

  public void setProductQuantity(Integer  productQuantity) {
    this.productQuantity = productQuantity;
  }


  public String getProductIcon() {
    return productIcon;
  }

  public void setProductIcon(String productIcon) {
    this.productIcon = productIcon;
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
