package com.springcloud.urlconnectionbenchmark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Benchmark {
    private String content;
    private long timelap;
}
