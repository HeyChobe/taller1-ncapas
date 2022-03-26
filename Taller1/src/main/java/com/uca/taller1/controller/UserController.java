package com.uca.taller1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@GetMapping("/")
	public String showLobby() {
		return "index.jsp";
	}
	
	@PostMapping("/success")
	public String showResult(@RequestParam("name") String name, 
			@RequestParam("lastname") String lastname, 
			@RequestParam("ucaid") String ucaid,
			@RequestParam("department") String department,
			@RequestParam("birthday") String birthday,
			ModelMap model){
		
		model.put("name", name);
		model.put("lastname", lastname);
		model.put("ucaId", ucaid);
		model.put("department", department);
		model.put("birthDay", birthday);
		
		return "success.jsp";
	}
}
