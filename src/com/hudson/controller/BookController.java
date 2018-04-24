package com.hudson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/**
 * 
 * @������: ����ͼ����������� 
 * @������: huhan 
 * @����ʱ��:2018��4��24�� ����12:10:16  
 * @version V1.0
 */
import org.springframework.web.bind.annotation.RequestMapping;

import com.hudson.bean.Book;
import com.hudson.service.BookService;
@Controller
public class BookController {
	
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	@RequestMapping(value="/main")
	public String main(Model model){
		List<Book> book_list=bookService.getAll();
		model.addAttribute("book_list", book_list);
		return "main";
		
	}

}
