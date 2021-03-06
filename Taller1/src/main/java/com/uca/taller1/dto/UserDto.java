package com.uca.taller1.dto;

import com.uca.taller1.models.Student;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;
import lombok.Data;

// data transfer object
@Data
public class UserDto {
  @NotBlank(message = "The depto is required.")
  private String depto;

  @NotBlank(message = "The name is required.")
  private String name;

  @NotBlank(message = "The lastname is required.")
  private String lastname;

  @NotBlank(message = "The id of uca is required.")
  @Pattern(regexp = "^\\d{8}$", message = "The uca code is invalid.")
  private String idUca;

  @NotBlank(message = "The dob name is required.")
  @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((19[0-9][0-9])|(200[0-9]|201[0-5]))$", flags = { Flag.CASE_INSENSITIVE }, message = "Invalid date of birhtday")
  private String dob;

  public Student toStudent() {
    return new Student(depto, name, lastname, idUca, dob);
  }
}

