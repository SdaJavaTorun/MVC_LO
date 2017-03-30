package com.sdajava.mvc;

import com.sdajava.mvc.controller.StudentController;
import com.sdajava.mvc.model.Student;
import com.sdajava.mvc.view.StudentView;


public class Main {

    public static Student getStudent(){
        return new Student.Builder().name("imie").lastname("nazwisko").build();
    }

    public static void main(String[] args) {

        Student model = getStudent();

        StudentView studentView = new StudentView();

        StudentController studentController = new StudentController(model, studentView);

        studentController.viewUpdate();

    }
}
