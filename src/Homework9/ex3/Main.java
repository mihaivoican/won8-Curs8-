package Homework9.ex3;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Person> lista = new TreeSet<Person>();
        Person p1 = new Person("Big Boss",55,"manager");
        Person p2 = new Person("Ionescu M",55,"welder");
        Person p3 = new Person("Georgescu V",55,"carpenter");
        Person p4 = new Person("Florescu V",55,"plummer");
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        Company companie = new Company(lista);

        System.out.println(String.format("Managerul este %s de %s ani",companie.getManager().getName(), companie.getManager().getAge()));

    }
}
