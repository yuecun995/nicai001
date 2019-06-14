package com.bw.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.mapper.BookMapperDao;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapperDao bookMapperDao; 
	
	public List<Map<String, Object>> getBookList(Map<String, Object> map) {
		return bookMapperDao.getBookList(map);
	}

}
