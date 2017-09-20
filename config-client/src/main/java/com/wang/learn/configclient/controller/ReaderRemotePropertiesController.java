/**
 * ReaderRemotePropertiesController 2017/9/20 19:48
 * <p>
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.wang.learn.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gang.wang
 * @Title: ReaderRemotePropertiesController
 * @Description: (描述此类的功能)
 * @date 2017/9/20 19:48
 */
@RestController
@RequestMapping("/")
public class ReaderRemotePropertiesController {

	@Value("${foo.version}")
	private String version;

	@RequestMapping("/properties")
	public String properies(){
		return "get remote properties:"+version;
	}
}
