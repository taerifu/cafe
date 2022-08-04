package com.example.demo.menu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.menu.service.MenufanService;

@RestController
@RequestMapping("/home")
public class MenufanController {
	
	@Autowired
	MenufanService menufanServ;	
	
	@GetMapping("/{id}")
	public List<Map<String, Object>> selectMenuAll(@PathVariable String id) {
		System.out.println("id!!!!!			"+id);
		return menufanServ.selectMenuAll();
	}
	
	
}
