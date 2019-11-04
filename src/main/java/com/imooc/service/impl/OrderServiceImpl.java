package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import com.imooc.service.OrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        //查询商品
        for (OrderDetail orderDetail : orderDTO.getOrderDetailList()){

        }
        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
