package com.sdajava.mvc.controller;

import com.sdajava.mvc.model.Student;
import com.sdajava.mvc.view.StudentView;


public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model,
                             StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        model.name = name;
    }

    public void setLastname(String lastname){
        model.lastname = lastname;
    }

    public String getName(){
        return model.name;
    }

    public String getLastname(){
        return model.lastname;
    }

    public void viewUpdate(){
        view.printStudetnDetails(getLastname(),
            getName());
    }


}
