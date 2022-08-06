package com.example.demo.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.menu.service.MenufanService;
import com.example.demo.menu.vo.MenuVo;

@RequestMapping("/getMenuVO")
@RestController
public class F_DTOSampleController {
	
	@Autowired
	MenufanService menufanServ;
	
	@GetMapping("/{menuId}")
	public MenuVo selectMenuVo(@PathVariable int menuId) {
		return menufanServ.selectMenuVo(menuId);
	}
	
}
