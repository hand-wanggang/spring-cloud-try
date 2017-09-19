/**
 * RobbonRequestController 2017/9/19 20:04
 * <p>
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.wang.learn.ribbondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
	public String requestServerInfo(){

		return restTemplate.getForObject(requestUrl,String.class);
	}
}
