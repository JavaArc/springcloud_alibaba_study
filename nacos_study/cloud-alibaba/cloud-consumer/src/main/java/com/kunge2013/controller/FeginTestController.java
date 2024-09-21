package com.kunge2013.controller;

import com.kunge2013.feign.EchoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kunge2013
 * @Description TODO
 * @Date 2024/9/21 21:59
 * @Version 1.0
 */
@RestController
public class FeginTestController {
    @Autowired
    private EchoClient echoClient;

    @GetMapping("/echo-feign/{str}")
    public String feign(@PathVariable String str) {
        return echoClient.echo(str);
    }
}
