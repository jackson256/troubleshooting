package com.hudson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @类描述: 动态页面跳转控制器
 * @创建人: hudson  
 * @创建时间:2018年4月23日 下午11:46:40  
 * @version V1.0
 */
@Controller
public class FormController {
	
	@RequestMapping("/{formname}")
	public String loginForm(@PathVariable String formname) {
		//动态跳转页面
		return formname;
	}
}
