package com.example.order.service;


import com.example.order.client.StorageClient;
import com.example.order.entity.Order;
import com.example.order.repository.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @className: com.example.order.orderservice.service-> OrderService
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:11
 * @version: 1.0
 * @todo:
 */
@Service
public class OrderService {
    @Autowired
    StorageClient storageClient;
    @Autowired
    OrderDAO orderDAO;
    public String selectAll() {
        Order order = orderDAO.selectById("1");
        return order.toString();

    }

    public void createOrder() {
        Order order = new Order();
        String code = System.currentTimeMillis()+"";
        order.setCount(1);
        order.setCommodityCode(code);
        order.setMoney(BigDecimal.valueOf(111L));
        orderDAO.insert(order);
        storageClient.deStorage(code);
    }
    public void createOrderError() {
        Order order = new Order();
        String code = System.currentTimeMillis()+"";
        order.setCount(1);
        order.setCommodityCode(code);
        order.setMoney(BigDecimal.valueOf(111L));
        orderDAO.insert(order);
        storageClient.deStorageError(code);
    }

    public String test() {
        storageClient.test();
        return "ok";
    }
}
