package com.kunge2013.feign;

import com.kunge2013.config.feign.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author kunge2013
 * @Description TODO
 * @Date 2024/9/21 21:52
 * @Version 1.0
 */
@FeignClient(name = "cloud-provider", contextId = "cloud-provider", fallback = EchoClientFallback.class, configuration = FeignConfiguration.class)
public interface EchoClient {
    /**
     * Call the echo method of the remote provider or roll back when the service is blown.
     *
     * @param str str
     * @return {@link String}
     */
    @GetMapping("/echo/{str}")
    String echo(@PathVariable("str") String str);
}
