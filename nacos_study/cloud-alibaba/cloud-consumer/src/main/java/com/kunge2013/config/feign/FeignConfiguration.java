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

package com.kunge2013.config.feign;

import com.kunge2013.feign.EchoClient;
import com.kunge2013.feign.EchoClientFallback;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration for Feign.
 *
 * @author fangjian0423, MieAh
 */
public class FeignConfiguration {
	@Bean
	public EchoClient echoClientFallback() {
		return new EchoClientFallback();
	}
//
//	@LoadBalanced
//	@Bean
//	public RestTemplate urlCleanedRestTemplate() {
//		return new RestTemplate();
//	}
//
//	@LoadBalanced
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

}
