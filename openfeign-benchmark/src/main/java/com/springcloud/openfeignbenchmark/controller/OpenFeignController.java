package com.springcloud.openfeignbenchmark.controller;

import com.springcloud.openfeignbenchmark.model.Benchmark;
import com.springcloud.openfeignbenchmark.service.OpenFeignService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
@CrossOrigin
public class OpenFeignController {

    final private OpenFeignService openFeignService;

    public OpenFeignController(OpenFeignService openFeignService) {
        this.openFeignService = openFeignService;
    }

    @GetMapping("/openfeign")
    public Benchmark openfeignRest() {
        return openFeignService.runConnection();
    }
}
