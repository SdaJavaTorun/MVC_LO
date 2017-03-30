package com.sdajava.mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas on 30.03.2017.
 */
public class Model {

    private Student student;
    List<Student> studentList = new ArrayList<>();

    public Model() {
    }

    public Student getStudent(){
        return new Student.Builder().
            name("imie").
            lastname("nazwisko").build();
    }

    public void populateStudent(){

        studentList.add(getStudent());
        studentList.add(getStudent());
        studentList.add(getStudent());
        studentList.add(getStudent());

    }

    public List<Student> getStudentList(){
        return studentList;
    }

}

