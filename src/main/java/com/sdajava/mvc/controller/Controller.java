package com.sdajava.mvc.controller;

import com.sdajava.mvc.model.Model;
import com.sdajava.mvc.view.View;


public class Controller {

    private Model model;
    private View view;

    public Controller(Model model,
                      View view) {
        this.model = model;
        this.view = view;
    }

    public void prepareData(){
        model.populateStudent();
    }

    public void showData(){

        view.printStudetnDetails(model.getStudentList());

    }

}
