package Homework9.ex3;

import java.util.HashSet;
import java.util.List;
//import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Person> lista = new HashSet<Person>();
        Person p1 = new Person("Big Boss", 55, "manager");
        Person p2 = new Person("Ionescu M", 25, "welder");
        Person p3 = new Person("Georgescu V", 45, "carpenter");
        Person p4 = new Person("Florescu V", 65, "plummer");
        Person p5 = new Person("Vasilescu L", 50, "carpenter");
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        Company companie = new Company(lista);

        System.out.println(String.format("Managerul este %s de %s ani", companie.getManager().getName(), companie.getManager().getAge()));

        //listam toti meseriasii de la o profesie
        List<Person> listaPersCalificare = companie.getPersonByProf("carpenter");
        for (Person p : listaPersCalificare) {
            System.out.println(String.format("%s : Nume : %s, varsta %s ", "carpenter", p.getName(), p.getAge()));
        }

        //listam pers mai mari decat o varsta data
        List<Person> listaPers = companie.getPersonsOlder(45);
        for (Person p : listaPers) {
            System.out.println(String.format("virsta minima %s : Nume : %s, varsta %s ", "45", p.getName(), p.getAge()));
        }

        //lista pers care contin in nume un sir dat
        List<Person> listaPers2 = companie.getPersonContainingString("escu");
        for (Person p : listaPers2) {
            System.out.println(String.format(" Nume : %s, varsta %s ", p.getName(), p.getAge()));
        }

        //angajam o pers noua
        Person p =new Person("Georgescu Adam",28,"strungar");

        Person p6 = companie.employ(p);

        System.out.println(String.format("A fost angajata persoana cu datele: Nume: %s, varsta: %s, profesia: %s",p6.getName(), p6.getAge(), p6.getPosition()));
    }
}
