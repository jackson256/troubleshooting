package com.hudson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hudson.bean.Book;
import com.hudson.mapper.BookMapper;

@Service("bookService")
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookMapper bookMapper;

	@Override
	public List<Book> getAll() {
		return bookMapper.finaAll();
	}

	
	

}
