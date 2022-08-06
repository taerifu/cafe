package com.example.demo.menu.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.menu.service.MenufanService;

@RequestMapping("/getNull")
@RestController
public class C_HashMapWithExceptionSampleController {
	
	@Autowired
	MenufanService menufanServ;	
	
	// uri path에 변수가 없을 때 
	// @PathVariable 속성을 required = false로 해준다.
	// menuId가 없을 때를 생각하여 path를 추가해준다.
	// 타입이 int인 변수는 null을 값으로 가질 수 없다. 
	// null 비교를 해주려면 String으로 변수를 받은 다음에 parseInt를 해주어야한다. int는 null을 값으로 가질 수가 없기 때문이다.
	@GetMapping(value = {"", "/", "/{menuId}"})
	public HashMap<String, Object> selectMenuByMap(@PathVariable(required = false) String menuId) {
		
		// menuId 가 null 이거나 공백일 때,
		// 반환할 값을 담을 hashMap을 하나 만들어준다. 
		if (menuId == null || "".equals(menuId)) {
			HashMap<String, Object> errorMap = new HashMap<String, Object>();
			errorMap.put("errorMsg", "일치하는 아이디가 없습니다.");
			return errorMap;
		}
		
		//menuId가 null이 아닐 때
		int tempId = Integer.parseInt(menuId);
		return menufanServ.selectMenuByMap(tempId);
		
	}
	
}
