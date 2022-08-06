package com.example.demo.menu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.menu.service.MenufanService;

// 기본값으로 "/"가 주소로 생성된다.
@RestController
public class A_ListOfHashMapSampleController {
	
	@Autowired
	MenufanService menufanServ;	
	
	@GetMapping
	public List<HashMap<String, Object>> selectMenuByList() {
		return menufanServ.selectMenuByList();
	}
	
	
}
