package com.bw.mapper;

import java.util.List;
import java.util.Map;

public interface BookMapperDao {

	List<Map<String, Object>> getBookList(Map<String, Object> map);
	
}
