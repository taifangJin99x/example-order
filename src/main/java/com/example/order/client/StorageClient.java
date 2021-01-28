package com.example.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @className: com.example.order.orderservice.client-> storageClient
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-12 16:52
 * @version: 1.0
 * @todo:
 */
@FeignClient(value = "storage")
public interface StorageClient {
    @GetMapping("/storage/test")
    String test();
    @RequestMapping(value = "/storage/deStorage",method = RequestMethod.GET)
    void deStorage(@RequestParam("code") String code);
    @RequestMapping(value = "/storage/deStorageError",method = RequestMethod.GET)
    void deStorageError(@RequestParam("code")String code);
    @RequestMapping(value = "/storage/updateStorage",method = RequestMethod.GET)
    void updateStorage(@RequestParam("code")String code);
}
