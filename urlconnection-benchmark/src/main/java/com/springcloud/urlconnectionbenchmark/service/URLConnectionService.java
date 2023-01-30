package com.springcloud.urlconnectionbenchmark.service;



import com.springcloud.urlconnectionbenchmark.model.Benchmark;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;


@Service
public class URLConnectionService {

    public Benchmark runConnection(String link) {
        String re = "";
        long elapsedTime = 0;
        URL url = null;
        long start = System.nanoTime();

        try {
            url = new URL(link);
            URLConnection urlcon = url.openConnection();
            re = urlcon.getContent().toString();
            elapsedTime = System.nanoTime() - start;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Benchmark(re, TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.MILLISECONDS));
        //return new Benchmark(re,elapsedTime);
    }

}
