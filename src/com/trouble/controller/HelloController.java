package com.trouble.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * @������: ��ע��
 * @������: huhan 
 * @����ʱ��:2018��4��21�� ����10:50:28  
 * @version V1.0
 */
public class HelloController implements Controller{
	
	private static final Log logger = LogFactory.getLog(HelloController.class);

	/**
	 * handleRequest��Controller�ӿڱ���ʵ�ֵķ���
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
