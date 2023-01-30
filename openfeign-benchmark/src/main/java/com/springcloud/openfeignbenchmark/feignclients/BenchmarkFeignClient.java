package com.springcloud.openfeignbenchmark.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://employeemanagermasscrud-default-rtdb.firebaseio.com/.json", value = "feign-for-benchmark")
public interface BenchmarkFeignClient {

    @GetMapping("/feignclient")
    public String getBenchmark();
}
