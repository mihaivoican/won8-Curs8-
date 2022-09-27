package Homework9.ex3;

import java.util.*;

public class Company {

    private Set<Person> angajati = new HashSet<Person>();

    public Company(Set<Person> angajati) {
        this.angajati = angajati;
    }

    public void setAngajati(Set<Person> angajati) {
        this.angajati = angajati;
    }

    public Set<Person> getAngajati() {
        return angajati;
    }

    //- getManager(): Person  - checks all persons and returns the one with position "manager"
    public Person getManager() {
        for (Person p : angajati) {
            if (p.getPosition().equals("manager")) {
                return p;
            }
        }
        return new Person("-", 0, "-");
    }

    // getPersons(String profession):List<Person>  - returns all the persons that have the received proffesion
    public List<Person> getPersonByProf(String profesia) {
        List<Person> listaP = new ArrayList<Person>();
        for (Person p : angajati) {
            if (p.getPosition().equals(profesia)) {
                listaP.add(p);
            }
        }
        return listaP;
    }

    // getPersonsOlder(int age): List<Person> - returns all the persons that are older than received age

    public List<Person> getPersonsOlder(int varsta) {
        List<Person> listaP = new ArrayList<Person>();
        for (Person p : angajati) {
            if (p.getAge() >varsta) {
                listaP.add(p);
            }
        }
        return listaP;
    }

    // getPerson(String filterName):List<Person> - returns all the persons that have names that contains the received string
    public List<Person> getPersonContainingString(String sir) {
        List<Person> listaP = new ArrayList<Person>();
        for (Person p : angajati) {
            if (p.getName().contains(sir)) {
                listaP.add(p);
            }
        }
        return listaP;
    }

    //- employ(Person) - employs a person. Adds it to the list of persons
    public Person employ(Person pers){
        int nrAng =angajati.size();
        angajati.add(pers);
        if(angajati.size() >nrAng){
            return pers;
        }else {
            return new Person("-",0,"-");
        }

    }

}

