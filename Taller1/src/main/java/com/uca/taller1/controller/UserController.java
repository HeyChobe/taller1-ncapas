package com.uca.taller1.controller;

import com.uca.taller1.dto.UserDto;
import com.uca.taller1.models.Student;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

  @GetMapping("/")
  public String showLobby() {
    return "index.jsp";
  }

  @PostMapping("/success")
  public String showResult(@Valid UserDto userDto, BindingResult bindingResult, ModelMap model) {
    if (bindingResult.hasErrors()) {
      return this.showErrorMessages(model, bindingResult);
    }

    Student student = userDto.toStudent();
    return this.successResponse(model, student);
  }

  private String showErrorMessages(ModelMap model, BindingResult bindingResult) {
    bindingResult
    .getFieldErrors()
    .forEach((error) -> model.put(error.getField() + "Error", error.getDefaultMessage()));

    return "index.jsp";
   }

   private String successResponse(ModelMap model, Student student) {
    model.put("name", student.name);
    model.put("lastname", student.lastname);
    model.put("birthDay", student.dob);
    model.put("idUca", student.idUca);
    model.put("department", student.depto);
    model.put("age", student.age);

    return "success.jsp";
   }
}
