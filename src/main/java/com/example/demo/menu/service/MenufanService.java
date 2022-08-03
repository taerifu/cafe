package com.example.demo.menu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.menu.mapper.MenufanMapper;

@Service
public class MenufanService {
	
	@Autowired
	MenufanMapper mapper;
	
	public List<Map<String, Object>> selectMenuAll() {
		return mapper.selectMenuAll();
	}
	
	
}
