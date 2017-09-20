package com.wang.learn.ribbondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class RibbonDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonDemoApplication.class, args);
	}

	@Bean
	@LoadBalanced //表示支持负载均衡
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
