package inheritance.homework8.ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Ion", "Ionescu", LocalDate.of(1960, 12, 30), "Buc, str Fara Nume 1", LocalDate.of(1997, 7, 25), "debutant");

        //cele 3 randuri de mai jos sunt pt formatarea campurilor de data la afisare
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd.MM.yyyy");


        System.out.println(String.format("Date angajat: Prenume: %s, Nume: %s, Nascut: %s, Adresa: %s, Pozitie: %s, Angajat: %s, Vechime: %s",
                emp1.getFirstName(),
                emp1.getLastName(),
                emp1.getBirthDate().format(formatData),
                emp1.getAddress(),
                emp1.getPosition(),
                emp1.getDateOfEmployment().format(formatData),
                emp1.calculVechime()));

        Programmer prg1 = new Programmer("John", "Smith", LocalDate.of(1999, 12, 31), "Kiew, London street 2", LocalDate.now(), "");

        System.out.println(String.format("Date angajat: Prenume: %s, Nume: %s, Nascut: %s, Adresa: %s, Pozitie: %s, Angajat: %s, Vechime: %s",
                prg1.getFirstName(),
                prg1.getLastName(),
                prg1.getBirthDate().format(formatData),
                prg1.getAddress(),
                prg1.getPosition(),
                prg1.getDateOfEmployment().format(formatData),
                prg1.calculVechime()));

        DatabaseAdmin dbAdmin = new DatabaseAdmin("Mircea", "Ionescu", LocalDate.of(1955, 1, 30), "Buc, Clea Grivitei 111", LocalDate.of(1990, 1, 10), "sef depart.");


        System.out.println(String.format("Date angajat: Prenume: %s, Nume: %s, Nascut: %s, Adresa: %s, Pozitie: %s, Angajat: %s, Vechime: %s",
                dbAdmin.getFirstName(),
                dbAdmin.getLastName(),
                dbAdmin.getBirthDate().format(formatData),
                dbAdmin.getAddress(),
                dbAdmin.getPosition(),
                dbAdmin.getDateOfEmployment().format(formatData),
                dbAdmin.calculVechime()));

    }
}
