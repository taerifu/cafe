package com.example.demo.menu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class MainController {
	
	@GetMapping("/main")
	public String map(Model model){
        model.addAttribute("text","지도");
        return "main";
    }
}
	
	