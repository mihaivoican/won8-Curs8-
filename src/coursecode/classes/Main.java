package org.fasttrackit.classes;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex");
        Person.Address address = person.new Address("Clujului", "Oradea");
        Person.School school = new Person.School("Eminescu");

        person.doSomethingSecret();

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.doSomethingSecret().compareTo(o2.doSomethingSecret());
            }
        };
    }
}
