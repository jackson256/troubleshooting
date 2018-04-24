package com.hudson.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
/**
 * 
 * @������: �����û����������
 * @������: hudson  
 * @����ʱ��:2018��4��24�� ����12:04:50  
 * @version V1.0
 */
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hudson.bean.User;
import com.hudson.service.UserService;
@Controller
public class UserController {
	/**
	 * @Autowired�Զ�ע�������Service����
	 * @Qualifierע������ָ��ע��ľ�������
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
			mv.addObject("message", "��¼�����������,���������룡");
			mv.setViewName("loginForm");
		}
		return mv;
	}

}
