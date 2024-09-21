package com.kunge2013.nacos.client.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

import static com.alibaba.nacos.api.common.Constants.DEFAULT_GROUP;

/**
 * @Author kunge2013
 * @Description TODO
 * @Date 2024/9/21 10:23
 * @Version 1.0
 */
@Configuration
@ConfigurationProperties(prefix = "test")
@Data
@NacosConfigurationProperties(prefix = "test", dataId = "nacos_config", groupId = DEFAULT_GROUP, autoRefreshed = true)
public class ConfigBean implements Serializable {
    private boolean useLocalCache;
    private String name;
}
