package org.example;

import org.example.controller.ClassRosterController;
import org.example.dao.ClassRosterAuditDao;
import org.example.dao.ClassRosterAuditDaoFileImpl;
import org.example.dao.ClassRosterDaofileImpl;
import org.example.dao.ClassRosterDao;
import org.example.service.ClassRosterServiceLayer;
import org.example.service.ClassRosterServiceLayerImpl;
import org.example.ui.ClassRosterView;
import org.example.ui.UserIO;
import org.example.ui.UserIOConsoleImpl;

public class App {
//    public static void main(String[] args) {
//        ClassRosterController controller = new ClassRosterController();
//        controller.run();
//    }

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaofileImpl();
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        ClassRosterController controller =
                new ClassRosterController(myService, myView);
        controller.run();
    }

}