package Homework9.ex3Prof;

public class Person {
    //in Java 17 exista linia urmatoare in log de clasa
    //public record Person(String name, int age, String position)
    //ea descrie fielduri statice mai simplu; + gettere fara sa fie scrise in clar; cred ca si constructor
    private String name;
    private int age;
    private String position;

    public boolean isManager() {
        return position.equals("manager");
    }

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }


}
