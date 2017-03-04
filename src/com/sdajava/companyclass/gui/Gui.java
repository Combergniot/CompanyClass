package com.sdajava.companyclass.gui;

/**
 * Created by RENT on 2017-02-23.
 */



//Funkcje statyczne nie wymagają odwoływania się do instancji klasy

public class Gui {
    public static void showMenu() {


        System.out.println("Witaj w naszym systemie!\n" +
                "1. Dodaj nowego pracownika \n" +
                "2. Dodaj nowego szefa \n" +
                "3. Pokaż wszystkich pracowników \n" +
                "4. Pokaż wszystkich szefów \n" +
                "0. Wyjście z programu");
    }

    public static String companyName = "TO MOJA DUŻA FIRMA!!!";


}

