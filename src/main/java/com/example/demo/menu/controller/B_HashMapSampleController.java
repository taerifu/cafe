package com.example.demo.menu.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.menu.service.MenufanService;

@RequestMapping("/getMap")
@RestController
public class B_HashMapSampleController {
	
	@Autowired
	MenufanService menufanServ;	
	
	// uri path에 들어가는 숫자는 int로 받을 수 있다. 
	@GetMapping("/{menuId}")
	public HashMap<String, Object> selectMenuByMap(@PathVariable int menuId) {
		return menufanServ.selectMenuByMap(menuId);
	}
	
}
