package com.kunge2013.nacos.controller;

import com.kunge2013.nacos.client.config.ConfigBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author kunge2013
 * @Description 配置信息
 * @Date 2024/9/20 14:32
 * @Version 1.0
 */
@RestController("/config")
@Controller

public class AppTestController {

    @Resource
    private ConfigBean configBean;

    @GetMapping(value = "/config")
    @ResponseBody
    public Map<String, Object> configMap() {
        return new HashMap<String, Object>() {{
            put("useLocalCache", configBean.isUseLocalCache());
        }};
    }
}
