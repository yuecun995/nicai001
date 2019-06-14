package com.bw.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("list.do")
	public String getBookList(Model model,
			@RequestParam(defaultValue="1")int cpage){
		Map<String,Object> map=new HashMap<>();
		//
		PageHelper.startPage(cpage, 3);
		//
		List<Map<String, Object>> bookList = bookService.getBookList(map);
		//	
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(bookList);
		//
		model.addAttribute("bookList", bookList);
		model.addAttribute("page", pageInfo);
		//
		return "list";
	} 
	
}
