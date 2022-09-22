// Create an object that will receive any person (from ex 2) and will have methods to return person related data:
//
// - fullName
//
// - age ( you need to calculate the number of years between two LocalDateTime variables
package inheritance.homework8.ex3Profesor;

import java.time.LocalDate;

public interface Person {
    LocalDate getBirthDate();

    String getFirstName();
}
