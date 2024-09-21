package com.kunge2013.config;

/**
 * @Author kunge2013
 * @Description TODO
 * @Date 2024/9/21 15:18
 * @Version 1.0
 */
/*
 * Copyright 2013-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Dynamic bean refresh example.
 *
 * @author lixiaoshuang
 */
@RestController
@RequestMapping("/config")
public class BeanAutoRefreshConfigExample {

    @Autowired
    private ConfigBean configBean;

    @Value("${testKey}")
    private String testKey;

    @GetMapping
    public Map<String, Object> getConfigInfo() {
        Map<String, Object> result = new HashMap<>();
        result.put("configBean", configBean.isUseLocalCache());
        return result;
    }
}