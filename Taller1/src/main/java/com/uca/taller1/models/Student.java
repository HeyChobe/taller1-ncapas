package com.uca.taller1.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    public final String depto;
    public final String name;
    public final String lastname;
    public final String idUca;
    public final String dob;
    public Integer age;

    public Student(String depto, String name, String lastname, String idUca, String dob){
        this.depto = depto;
        this.name = name;
        this.lastname = lastname;
        this.idUca = idUca;
        this.dob = dob;
        this.age = this.calculateAge(dob);
    }

    private Integer calculateAge(String lastAge) {
      try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        long age = (currentDate.getTime() - sdf.parse(lastAge).getTime())/1000/31557600;
        if (age <= 0){
          return -1;
        }

        return (int) age;
      }catch (ParseException e) {
        System.out.println(e);
        return -1;
      }
    }
}
