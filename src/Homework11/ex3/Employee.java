package Homework11.ex3;

import Homework11.ex2.Person;

//3. the Employee is an object that extends Person and adds two fields: company and salary.
public class Employee extends Person {
    private String company;
    private int salary;

    //constructor
    public Employee(String name, Integer age, String hairColour, String company,int salary) {
        super(name, age, hairColour);
        this.company= company;
        this.salary=salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
}
