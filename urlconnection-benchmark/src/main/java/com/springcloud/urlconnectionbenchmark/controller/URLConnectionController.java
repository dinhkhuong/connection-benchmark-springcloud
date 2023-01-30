package com.springcloud.urlconnectionbenchmark.controller;



import com.springcloud.urlconnectionbenchmark.model.Benchmark;
import com.springcloud.urlconnectionbenchmark.service.URLConnectionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
@CrossOrigin
public class URLConnectionController {
    String des = "https://employeemanagermasscrud-default-rtdb.firebaseio.com/.json";
    final private URLConnectionService urlConnectionService;

    public URLConnectionController(URLConnectionService urlConnectionService) {
        this.urlConnectionService = urlConnectionService;
    }

    @GetMapping("/urlconnection")
    public Benchmark urlConnectRest() {
        return urlConnectionService.runConnection(des);
    }
}
