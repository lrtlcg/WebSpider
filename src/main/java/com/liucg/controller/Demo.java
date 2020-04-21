package com.liucg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@RequestMapping("/demo")
	public Object inDemo() {
		return "欢迎进入测试页Demo";
	}
}
