package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;

import java.util.List;

public interface OrderDetailRepository {
    List<OrderDetail> findByOrderId(String orderId);
}
