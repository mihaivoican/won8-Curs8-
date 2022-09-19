package inheritance.homework8.ex2;

import java.time.LocalDate;
import java.util.Date;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;


    public DatabaseAdmin(String firstName, String lastName, LocalDate birthDate, String address, LocalDate dateOfEmployment, String position) {
        super(firstName, lastName, birthDate, address, dateOfEmployment, position);
    }

    @Override
    public String getAddress(){
        return "db admin " + super.getAddress();
    }
}
