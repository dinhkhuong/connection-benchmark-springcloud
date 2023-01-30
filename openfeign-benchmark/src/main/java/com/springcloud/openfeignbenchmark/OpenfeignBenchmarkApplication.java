package com.springcloud.openfeignbenchmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients("com.springcloud.openfeignbenchmark.feignclients")
public class OpenfeignBenchmarkApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenfeignBenchmarkApplication.class, args);
    }

}
