package com.sdajava.companyclass.controller;

import com.sdajava.companyclass.Boss;
import com.sdajava.companyclass.model.Worker;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RENT on 2017-02-21.
 */
public class UserInput {
    public Worker populateWorker() {

        Worker worker = new Worker(); // tworzymy nowy obiekt klasy Worker

        Scanner in = new Scanner(System.in);


            try {
                System.out.println("Podaj imię pracownika");
                worker.name = in.nextLine();
                System.out.println("Podaj nazwisko pracownika");
                worker.familyname = in.nextLine();
                System.out.println("Podaj zawód wykonywany przez pracownika");
                worker.profession = in.nextLine();  //Stringi mają pierwszeństwo!
                System.out.println("Podaj wiek pracownika");
                worker.age = in.nextInt();
                System.out.println("Podaj wzrost pracownika (w metrach)");
                worker.growth = in.nextDouble();
                System.out.println("Podaj wagę pracownika");
                worker.weight = in.nextInt();
                System.out.println("Podaj pensję pracownika");
                worker.salary = in.nextDouble();
            } catch (InputMismatchException e) {    // Bawimy się w przechwytywanie błędów
                System.out.println("Błąd: zły format danych.");
                System.exit(1);
            }

        return worker; //Zwracamy obiekt
    }

        public Boss populateBoss(){

        Boss boss = new Boss();  // tworzymy nowy obiekt klasy szef

        Scanner in = new Scanner(System.in);

try {


        System.out.println("Podaj imię szefa");
        boss.name=in.nextLine();
        System.out.println("Podaj nazwisko szefa");
        boss.familyname=in.nextLine();
            System.out.println("Podaj zawód wykonywany przez szefa");
            boss.profession=in.nextLine();
            System.out.println("Nazwa firmy");
            boss.company=in.nextLine();
        System.out.println("Podaj wiek szefa");
        boss.age=in.nextInt();
        System.out.println("Podaj wzrost szefa (w metrach");
        boss.growth=in.nextDouble();
        System.out.println("Podaj wagę szefa");
        boss.weight=in.nextInt();
                System.out.println("Podaj pensję szefa");
        boss.salary=in.nextDouble();
}catch (InputMismatchException e){
    System.out.println("Błąd: zły format danych");
    System.exit(1);
}
        return boss; //Zwracamy obiekt

    }
    }




