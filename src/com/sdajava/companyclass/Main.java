package com.sdajava.companyclass;


import com.sdajava.companyclass.controller.Controller;
import com.sdajava.companyclass.controller.UserInput;
import com.sdajava.companyclass.gui.Gui;
import com.sdajava.companyclass.model.Worker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {


        LOGGER.addHandler(new FileHandler("loger.log"));

        LOGGER.info("Logger Name: " + LOGGER.getName());

        //An array of size 3
        int[] a = {1, 2, 3};
        int index = 1;
        LOGGER.config("index is set to " + index);

        try {
            System.out.println(a[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            LOGGER.log(Level.SEVERE, "Exception occur", ex);
        }

            // logowanie

            String login = "marcin";
            String password = "123";

            String userLogin;
            String userPassword;

            boolean flag = true;
            boolean optionflag = true;
            int option;

            Scanner in = new Scanner(System.in);

            while (flag) {

                System.out.println("Podaj login: ");

                userLogin = in.nextLine();
                // Sprawdź skróty po prawej stronie - nextLine zwraca nam string

                System.out.println("Podaj hasło: ");
                userPassword = in.nextLine();

                if (!userLogin.equals(login) && !userPassword.equals(password)) {   //zaprzeczenie jest zawsze na początku!
                    System.out.println("Podałeś złe dane");
                } else {
                    flag = false;
                }
            }

            // menu


            Controller controller = new Controller();

            //obiekt klasy Controller. Pamiętaj, żeby obiekty klasy były umieszczone w odpowiednim miejscu

            System.out.println(Gui.companyName);

            while (optionflag) {


                Gui.showMenu();


                option = in.nextInt();


                switch (option) {
                    case 1:
                        controller.addWorker();


                        break;
                    case 2:
                        controller.addBoss();

                        break;

                    case 3:
                        controller.showWorkers();
                        break;

                    case 4:
                        controller.showBoss();
                        break;
                    case 0:
                        System.exit(1);
                        break;
                    default:
                        optionflag = false;

                }
            }


            List<Worker> workers = new ArrayList<>();


            Worker worker1 = new Worker();

            worker1.profession = "Programmer";
            worker1.salary = 123123;
            worker1.name = "John";
            worker1.familyname = "Smith";
            worker1.age = 34;
            worker1.growth = 1.87;
            worker1.weight = 87;

            Worker worker2 = new Worker();
            worker2.profession = "Priest";
            worker2.salary = 32123;
            worker2.name = "Arthur";
            worker2.familyname = "Koscielny";
            worker2.age = 72;
            worker2.growth = 1.75;
            worker2.weight = 65;

            worker2.getallworker();

            Worker worker3 = new Worker("Ala", "CoMaKota", 15, 1.56, 65, "Drug dealer", 23231);

            worker3.getallworker();

            Boss boss1 = new Boss("Zygfryd", "Bond", 65, 2.1, 90, "Project manager",
                    22222, "Microsoft");

            boss1.getallboss();

            workers.add(worker1);
            workers.add(worker2);
            workers.add(worker3);
            workers.add(boss1);
            System.out.println("Rozmiar listy: " + workers.size());


            for (Worker w : workers) {
                System.out.println("Imię pracownika: " + w.name + "     Nazwisko: " + w.familyname);
            }



    }
}
