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
 * @������: ����ע��Ŀ�����
 * @������: huhan 
 * @����ʱ��:2018��4��21�� ����10:50:28  
 * @version V1.0
 */
@Controller
public class HelloControllerAnn{
	
	private static final Log logger = LogFactory.getLog(HelloControllerAnn.class);

	@RequestMapping(value="helloAnn")
	public ModelAndView hello(){
		logger.info("handleRequest ������");
		//ModelAndViewͨ�������˷�����ͼ��,ģ�͵������Լ�ģ�Ͷ���
		ModelAndView mv = new ModelAndView();
		//���ģ������,�����������POJO����
		mv.addObject("message","Hello World!");
		//��ͼ��,��ͼ����������ݸ����ֽ������������ͼҳ��
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		return mv;
	}
	

}
