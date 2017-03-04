package com.sdajava.companyclass.model;

/**
 * Created by RENT on 2017-02-20.
 */
public class Worker extends Human {
    public String profession;
    public double salary;

    public Worker() {

    }

    public Worker(String name, String familyname, int age,
                  double growth, int weight, String profession, double salary) {
        super(name, familyname, age, growth, weight);
        this.profession = profession;
        this.salary = salary;
    }

    public void getallworker() {
        System.out.println("Profession: " + this.profession);
        System.out.println("Salary: " + this.salary);
        System.out.println("Name: " + this.name);
        System.out.println("Family name: " + this.familyname);
        System.out.println("Age: " + this.age);
        System.out.println("Growth: " + this.growth);
        System.out.println("Weight: " + this.weight);
    }
}
