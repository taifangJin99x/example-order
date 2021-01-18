package com.example.order.api;


import com.example.order.client.StorageClient;
import com.example.order.service.OrderService;
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
    @Autowired
    StorageClient storageClient;

    @GetMapping("/getOrder")
    public String getOrder() {

        return orderService.selectAll();
    }
    @GetMapping("/test")
    public String testClient() {
        log.info("TEST");
        return storageClient.test();
    }

    @GetMapping("/testString")
    public String testString() {
        log.info("TEST");
        return "testString";
    }
}
