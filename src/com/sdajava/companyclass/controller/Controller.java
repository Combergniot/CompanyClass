package com.sdajava.companyclass.controller;

import com.sdajava.companyclass.Boss;
import com.sdajava.companyclass.model.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-21.
 */
public class Controller {

    public UserInput userInput = new UserInput();
    public List<Worker> workerList=new ArrayList<>();
    public List<Boss> bossList=new ArrayList<>();

    public void addWorker(){
        System.out.println("Dodaje pracownika...");
        Worker w1 = userInput.populateWorker();
        workerList.add(w1);
        //workerList.add(userInput.populateWorker()); - inna metoda
    }
    public void addBoss(){
        System.out.println("Dodaje szefa...");
        bossList.add(userInput.populateBoss());
    }
    public void showWorkers(){
        System.out.println("Pokazuje wszystkich pracowników...");
        System.out.println("W firmie mamy " +workerList.size() +" pracowników");
        // wyzej sprawdzamy czy lista zawiera pracowników/ czy działa nam pętla for
        for (Worker w:workerList){
            System.out.println("Imię: " + w.name + " Nazwisko: " + w.familyname);
        }
    }
    public void showBoss(){
        System.out.println("Pokazuje wszystkich szefów");
        for (Boss b:bossList){
            System.out.println("Imię: " + b.name + " Nazwisko: " + " Firma: " + b.company);
    }
}}
