package com.uca.taller1.models;

public class Student {
    public final String depto;
    public final String name;
    public final String lastname;
    public final String idUca;
    public final String dob;

    public Student(String depto, String name, String lastname, String idUca, String dob){
        this.depto = depto;
        this.name = name;
        this.lastname = lastname;
        this.idUca = idUca;
        this.dob = dob;
    }
}
