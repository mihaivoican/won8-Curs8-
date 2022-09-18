package inheritance.homework8.ex2;

import java.util.Date;

public class Programmer extends Employee{
    private String language;

    public Programmer(String firstName, String lastName, Date birthDate, String address, Date dateOfEmployment, String position) {
        super(firstName, lastName, birthDate, address, dateOfEmployment, position);
    }

    @Override
    public String getPosition(){
        return "programmer";
    }
}
