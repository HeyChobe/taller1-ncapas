package com.uca.taller1.controller;

import com.uca.taller1.dto.UserDto;
import com.uca.taller1.models.Student;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

	@GetMapping("/")
	public String showLobby() {
		return "index.jsp";
	}
	
	@PostMapping("/success")
	public String showResult(@Valid UserDto userDto, ModelMap model){
		Student student = userDto.toStudent();
		model.put("name", student.name);
		model.put("lastname", student.lastname);
		model.put("birthDay", student.dob);
		model.put("idUca", student.idUca);
		model.put("department", student.depto);	
		return "success.jsp";
	}
}
