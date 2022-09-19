package inheritance.homework8.ex3;

import inheritance.homework8.ex2.DatabaseAdmin;
import inheritance.homework8.ex2.Employee;
import inheritance.homework8.ex2.Programmer;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Employee[] pers = new Employee[3];
        pers[0]= new Employee("Mihai","Vasilescu", LocalDate.of(1990,12,31),"",LocalDate.now(),"");
        pers[1] = new Programmer("Nathan","Halliday",LocalDate.of(1964,4,28),"Buc",LocalDate.now(),"");
        pers[2] = new DatabaseAdmin("Maria","Georgescu",LocalDate.of(2000,10,22),null,null,null);

        for(int i=0; i<pers.length; i++){
            System.out.println(String.format("Persoana: %s, varsta: %s",fullName(pers[i]),age(pers[i])));
        }


    }

    private static String fullName(Employee pers){
        return pers.getFirstName() + " " + pers.getLastName();
    }

    private static int age(Employee pers){
        Period varsta = Period.between(pers.getBirthDate(),LocalDate.now());
        return varsta.getYears();
    }
}
