package com.hudson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @������: ��̬ҳ����ת������
 * @������: hudson  
 * @����ʱ��:2018��4��23�� ����11:46:40  
 * @version V1.0
 */
@Controller
public class FormController {
	
	@RequestMapping("/{formname}")
	public String loginForm(@PathVariable String formname) {
		//��̬��תҳ��
		return formname;
	}
}
