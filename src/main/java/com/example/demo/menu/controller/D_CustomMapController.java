package com.example.demo.menu.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.menu.service.MenufanService;

@RequestMapping("/customMap")
@RestController
public class D_CustomMapController {
	
	@Autowired
	MenufanService menufanServ;	
	
	@GetMapping("/{menuId}")
	public HashMap<String, Object> selectMenuByCustomMap(@PathVariable int menuId) {
		return menufanServ.selectMenuByCustomMap(menuId);
	}

}
