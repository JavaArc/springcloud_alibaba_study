package com.kunge2013.nacos;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Author kunge2013
 * @Description 服务发现测试
 * @Date 2024/9/21 10:41
 * @Version 1.0
 */
@Controller
@RequestMapping("discovery")
public class DiscoveryController {

    @NacosInjected
    private NamingService namingService;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
//        namingService.registerInstance(serviceName,
//                new Instance()
//                {{
//                    setEnabled(true);
//                    setHealthy(true);
//                    setIp("127.0.0.1");
//                    setPort(9090);
//                }}
//        );
        return namingService.getAllInstances(serviceName);
    }
}
