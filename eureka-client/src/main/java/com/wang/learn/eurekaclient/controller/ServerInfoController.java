/**
 * ServerInfoController 2017/9/19 18:50
 * <p>
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.wang.learn.eurekaclient.controller;

import com.wang.learn.eurekaclient.dto.SysMail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author gang.wang
 * @Title: ServerInfoController
 * @Description: (描述此类的功能)
 * @date 2017/9/19 18:50
 */
@RestController
@RequestMapping("/")
public class ServerInfoController {

	@Value("${server.port}")
	private String serverPort;
	@Value("${spring.application.name}")
	private String serverName;

	@RequestMapping("/info")
	public String getInfo(){
		return "ServerName:"+serverName+";Server Port:"+serverPort;
	}

	@RequestMapping(value = "/mail", method = { RequestMethod.POST})
	public Map sendMail(SysMail sysMail) {
		System.out.println("===================="+sysMail);
		return null;
	}
}
