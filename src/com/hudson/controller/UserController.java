package com.hudson.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
/**
 * 
 * @类描述: 处理用户请求控制器
 * @创建人: hudson  
 * @创建时间:2018年4月24日 上午12:04:50  
 * @version V1.0
 */
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hudson.bean.User;
import com.hudson.service.UserService;
@Controller
public class UserController {
	/**
	 * @Autowired自动注入服务层的Service对象
	 * @Qualifier注解用于指明注入的具体类型
	 */
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	public ModelAndView login(String loginname,String password,
			ModelAndView mv,HttpSession session){
		User user = userService.login(loginname, password);
		if(user != null){
			session.setAttribute("user", user);
			mv.setView(new RedirectView("/fkbookapp/main"));
		}else{
			mv.addObject("message", "登录名或密码错误,请重新输入！");
			mv.setViewName("loginForm");
		}
		return mv;
	}

}
