package com.sdajava.companyclass.model;

/**
 * Created by RENT on 2017-02-20.
 */
public class Human {
    public String name;
    public String familyname;
    public int age;
    public double growth;
    public int weight;

    public Human(String name, String familyname, int age, double growth, int weight){
        this.name =name;
        this.familyname = familyname;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
    }

    public Human()
    {

    }

    public void getallhuman(){
        System.out.println("Name: " + this.name);
        System.out.println("Family name: " + this.familyname);
        System.out.println("Age: " + this.age);
        System.out.println("Growth: " + this.growth);
        System.out.println("Weight: " + this.weight);
    }

}
