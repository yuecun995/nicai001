package com.bw.service;

import java.util.List;
import java.util.Map;

public interface BookService {

	List<Map<String, Object>> getBookList(Map<String, Object> map);
}
