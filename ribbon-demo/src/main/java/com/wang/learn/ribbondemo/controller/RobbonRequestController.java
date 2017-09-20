/**
 * RobbonRequestController 2017/9/19 20:04
 * <p>
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.wang.learn.ribbondemo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.File;

/**
 * @author gang.wang
 * @Title: RobbonRequestController
 * @Description: (描述此类的功能)
 * @date 2017/9/19 20:04
 */
@RestController
@RequestMapping("/")
public class RobbonRequestController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${request.url}")
	private String requestUrl;

	@RequestMapping("/request")
	@HystrixCommand(fallbackMethod = "hasError")
	public String requestServerInfo() {
		FileSystemResource resource = new FileSystemResource(
				new File("C:\\Users\\deep\\Desktop\\excel\\FndMessage.xlsx"));
		MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
		param.add("attachments", resource);
		param.add("id", 10000L);
		param.add("subject", "send file by email");
		return restTemplate.postForObject(requestUrl, param, String.class);
	}

	public String hasError() {
		return "sorry! error!";
	}
}
