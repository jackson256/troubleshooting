package com.trouble.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
/**
 * @类描述: 基于注解的控制器
 * @创建人: huhan 
 * @创建时间:2018年4月21日 下午10:50:28  
 * @version V1.0
 */
@Controller
public class HelloControllerAnn{
	
	private static final Log logger = LogFactory.getLog(HelloControllerAnn.class);

	@RequestMapping(value="helloAnn")
	public ModelAndView hello(){
		logger.info("handleRequest 被调用");
		//ModelAndView通常包含了返回视图名,模型的名称以及模型对象
		ModelAndView mv = new ModelAndView();
		//添加模型数据,可以是任意的POJO对象
		mv.addObject("message","Hello World!");
		//视图名,视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		return mv;
	}
	

}
