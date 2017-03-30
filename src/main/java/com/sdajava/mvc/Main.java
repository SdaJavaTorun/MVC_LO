package com.sdajava.mvc;

import com.sdajava.mvc.controller.Controller;
import com.sdajava.mvc.model.Model;
import com.sdajava.mvc.view.View;


public class Main {


    public static void main(String[] args) {

        Model model = new Model();

        View view = new View();

        Controller controller = new Controller(model, view);

        controller.prepareData();
        controller.showData();



    }
}
