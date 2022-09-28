package Homework9.ex3Prof;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company {
    private List<Person> employees = new ArrayList<>();

    //metoda de adaugare angajati
    public void employ(Person person) {
        //verific daca pers de adaugat nu e manager si daca nu am deja manager
        if (person.isManager() && this.hasManager()) {
            System.out.println("Already has a manager");
        }
        employees.add(person);
    }

    //verificare daca am deja un manager angajat
    private boolean hasManager() {
        for (Person p : employees) {
            if (p.isManager()) {
                return true;
            }
        }
        return false;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> result = new ArrayList<>();
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person currentPerson = iterator.next();
            if (currentPerson.getAge() > age) {
                result.add(currentPerson);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Company company = new Company();
        //asa se initializeaza corect si se umple cu date companie prin metoda employ, NU prin add la lista de pers
        company.employ(new Person("Alex", 31, "welder"));
        company.employ(new Person("John", 23, "manager"));
        System.out.println(company.getPersonsOlder(20));
    }
}
