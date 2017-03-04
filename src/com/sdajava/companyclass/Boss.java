package com.sdajava.companyclass;

import com.sdajava.companyclass.model.Worker;

/**
 * Created by RENT on 2017-02-20.
 */
public class Boss extends Worker {
    public String company;

    public Boss(){}

    public Boss(String name, String familyname, int age, double growth,
                int weight, String profession, double salary, String company) {
        super(name,familyname,age,growth,weight,profession,salary);
        this.company = company;
    }

    public void getallboss() {
        System.out.println("Company: " + this.company);
        System.out.println("Profession: " + this.profession);
        System.out.println("Salary: " + this.salary);
        System.out.println("Name: " + this.name);
        System.out.println("Family name: " + this.familyname);
        System.out.println("Age: " + this.age);
        System.out.println("Growth: " + this.growth);
        System.out.println("Weight: " + this.weight);
    }

}
