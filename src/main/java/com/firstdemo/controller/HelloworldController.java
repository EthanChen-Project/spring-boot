package com.firstdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	@RequestMapping("/index/{name}")
	@ResponseBody
	public String index(@PathVariable String name) {

		if (null == name) {
			name = "boy";
		}

		return "hello world" + name;
	}
}
