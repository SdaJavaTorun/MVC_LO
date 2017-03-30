package com.sdajava.mvc.view;


import com.sdajava.mvc.model.Student;

import java.util.List;

public class View {

    public void printStudetnDetails(List<Student> list){

        list.forEach(v -> System.out.println("Imie: " + v.name));

    }


}
