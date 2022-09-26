package Homework9.ex3;

import java.util.Set;
import java.util.TreeSet;

public class Company {
    private Set<Person> angajati = new TreeSet<Person>();

    public Company(Set<Person> angajati) {
        this.angajati = angajati;
    }

    public void setAngajati(Set<Person> angajati) {
        this.angajati = angajati;
    }

    public Set<Person> getAngajati() {
        return angajati;
    }

    public Person getManager() {
        for (Person p : angajati) {
            if (p.getPosition().equals("manager")) {
                return p;
            }
        }
        return new Person("-", 0, "-");
    }

}

