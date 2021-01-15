package com.example.order;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.PostConstruct;

@EnableFeignClients
@EnableDiscoveryClient
@NacosPropertySource(dataId = "order",autoRefreshed = true)
@SpringBootApplication
public class ExampleOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleOrderApplication.class, args);
    }
    @NacosInjected
    private NamingService namingService;

    @Value("${server.port}")
    private int serverPort;

    @Value("${spring.application.name}")
    private String applicationName;
    @PostConstruct
    public void registerInstance() throws NacosException {
        namingService.registerInstance(applicationName,"127.0.0.1",serverPort);
    }

}
