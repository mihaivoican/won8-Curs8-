package inheritance.homework8.ex2;

import java.util.Date;

public class Employee implements Person{

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String address;
    private Date dateOfEmployment;
    private String position;


    public Employee(String firstName, String lastName, Date birthDate, String address, Date dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
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
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }
}
