package inheritance.homework8.ex2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee implements Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String address;
    private LocalDate dateOfEmployment;
    private String position;


    public Employee(String firstName, String lastName, LocalDate birthDate, String address, LocalDate dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.position = position;
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public String  calculVechime(){
        Period vechime = Period.between(this.dateOfEmployment, LocalDate.now());
        return String.format("Ani %s, Luni %s, zile %s",vechime.getYears(),vechime.getMonths(),vechime.getDays());
    }
}
