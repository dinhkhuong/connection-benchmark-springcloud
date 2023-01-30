package com.springcloud.okhttpbenchmark.service;

import com.springcloud.okhttpbenchmark.model.Benchmark;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class OkHttpService {

    public Benchmark runConnection(String link) {
        String re = "";
        long elapsedTime = 0;
        //URL url = null;

        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(1000, TimeUnit.MILLISECONDS)
                .writeTimeout(1000, TimeUnit.MILLISECONDS)
                .build();

        Request request = new Request.Builder()
                .url(link)
                .build();
        long start = System.nanoTime();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            re = response.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        elapsedTime = System.nanoTime() - start;
        return new Benchmark(re, TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.MILLISECONDS));
        //return new Benchmark(re, elapsedTime);
    }
}
