package com.springcloud.openfeignbenchmark.service;

import com.springcloud.openfeignbenchmark.feignclients.BenchmarkFeignClient;
import com.springcloud.openfeignbenchmark.model.Benchmark;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class OpenFeignService {

    final protected BenchmarkFeignClient benchmarkFeignClient;

    public OpenFeignService(BenchmarkFeignClient benchmarkFeignClient) {
        this.benchmarkFeignClient = benchmarkFeignClient;
    }

    public Benchmark runConnection() {
        String re = "";
        long elapsedTime = 0;
        long start = System.nanoTime();
        re = benchmarkFeignClient.getBenchmark();
        elapsedTime = System.nanoTime() - start;
        //return new Benchmark(re, elapsedTime);
        return new Benchmark(re, TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.MILLISECONDS));
    }
}
