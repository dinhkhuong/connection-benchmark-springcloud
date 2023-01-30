package com.springcloud.okhttpbenchmark.controller;

import com.springcloud.okhttpbenchmark.model.Benchmark;
import com.springcloud.okhttpbenchmark.service.OkHttpService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
@CrossOrigin
public class OKHttpController {
    String des = "https://employeemanagermasscrud-default-rtdb.firebaseio.com/.json";
    final private OkHttpService okHttpService;

    public OKHttpController(OkHttpService okHttpService) {
        this.okHttpService = okHttpService;
    }

    @GetMapping("/okhttp")
    public Benchmark okHttpRest() {
        return okHttpService.runConnection(des);
    }
}
