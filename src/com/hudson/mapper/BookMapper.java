package com.hudson.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hudson.bean.Book;

public interface BookMapper {
	
	@Select("select * from tb_book")
	List<Book> finaAll();

}
