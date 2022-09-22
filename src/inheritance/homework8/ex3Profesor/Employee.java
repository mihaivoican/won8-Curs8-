package inheritance.homework8.ex3Profesor;

import java.time.LocalDate;

public class Employee implements Person{
    private LocalDate birthDate;

    public Employee(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }
//nu e terminata
    @Override
    public String getFirstName() {
        return null;
    }
}
