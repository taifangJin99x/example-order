package com.example.order.api;


import com.example.order.client.StorageClient;
import com.example.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.example.order.orderservice.api-> OrderController
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:11
 * @version: 1.0
 * @todo:
 */
@Slf4j
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;


    @GetMapping("/getOrder")
    public String getOrder() {

        return orderService.selectAll();
    }
    @GetMapping("/createOrder")
    @GlobalTransactional(name = "example-create-order",rollbackFor = Exception.class)
    public String createOrder() {
        log.info("TEST");
         orderService.createOrder();
         return "ok";
    }

    @GetMapping("/createOrderError")
    @GlobalTransactional(name = "example-create-order",rollbackFor = Exception.class)
    public String createOrderError() {
        log.info("TEST");
        orderService.createOrderError();
        return "ok";
    }

    @GetMapping("/testString")
    public String testString() {
        log.info("TEST");
        return orderService.test();
    }
}
