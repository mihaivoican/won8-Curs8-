package inheritance.homework8.ex3Profesor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //initializez o persoana cu cls Employee ce implementeaza persoana; tot asa se putea face si cu orice alta cls care implement interfata Person!
        PersonData personData = new PersonData(new Employee(LocalDate.of(1991, 9, 25)));
        System.out.println(personData.getAge());
    }

}
