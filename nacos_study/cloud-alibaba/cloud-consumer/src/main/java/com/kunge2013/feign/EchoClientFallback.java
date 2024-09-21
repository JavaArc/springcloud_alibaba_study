package com.kunge2013.feign;

/**
 * @Author kunge2013
 * @Description feign 定义
 * @Date 2024/9/21 21:54
 * @Version 1.0
 */
public class EchoClientFallback implements EchoClient {
    @Override
    public String echo(String str) {
        return "echo fallback";
    }
}
