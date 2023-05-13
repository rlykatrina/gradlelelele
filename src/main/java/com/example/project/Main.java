package com.example.project;

import com.example.project.mvc.controllers.BoxController;
import com.example.project.mvc.controllers.DecorationController;
import com.example.project.mvc.controllers.SweetController;
import com.example.project.mvc.services.SweetService.SweetServiceImpl;
import com.example.project.mvc.services.boxService.BoxServiceImpl;
import com.example.project.mvc.services.decorationService.DecorationService;
import com.example.project.mvc.services.decorationService.DecorationServiceImpl;
import com.example.project.mvc.view.ConsoleView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SweetServiceImpl sweetService = new SweetServiceImpl();
        DecorationServiceImpl decorationService = new DecorationServiceImpl();
        BoxServiceImpl boxService = new BoxServiceImpl();

        Scanner scanner = new Scanner(System.in);

        SweetController sweetController = new SweetController(sweetService, scanner);
        DecorationController decorationController = new DecorationController(decorationService, scanner);
        BoxController boxController = new BoxController(boxService, sweetService, decorationService, scanner);

        ConsoleView consoleView = new ConsoleView(sweetController, decorationController, boxController);

        consoleView.readData();
        consoleView.init();
    }
}