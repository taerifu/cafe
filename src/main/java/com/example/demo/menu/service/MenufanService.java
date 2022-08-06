package com.example.demo.menu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.menu.mapper.MenufanMapper;
import com.example.demo.menu.vo.MenuVo;

@Service
public class MenufanService {
	
	@Autowired
	MenufanMapper mapper;
	
	public List<HashMap<String, Object>> selectMenuByList() {
		return mapper.selectMenuByList();
	}
	
	public HashMap<String, Object> selectMenuByMap(int menuId) {
		return mapper.selectMenuByMap(menuId);
	}
	
	public HashMap<String, Object> selectMenuByCustomMap(int menuId) {
		return mapper.selectMenuByCustomMap(menuId);
	}
	
	public List<HashMap<String, Object>> selectMenuByListLikeISaid() {
		return mapper.selectMenuByListLikeISaid();
	}
	
	public MenuVo selectMenuVo(int menuId) {
		return mapper.selectMenuVo(menuId);
	}

}
