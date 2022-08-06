package com.example.demo.menu.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.menu.service.MenufanService;

@RequestMapping("/myquery")
@RestController
public class E_SetQueryInMapperController {
	
	@Autowired
	MenufanService menufanServ;	
	
	@GetMapping
	public List<HashMap<String, Object>> selectMenuByListLikeISaid() {
		return menufanServ.selectMenuByListLikeISaid();
	}
	
}
