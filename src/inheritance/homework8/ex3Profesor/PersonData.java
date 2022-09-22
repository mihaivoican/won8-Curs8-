package inheritance.homework8.ex3Profesor;

import java.time.LocalDate;
import java.time.Period;
//Atentie: o rezolvare mai speciala. PersonDAta nu implemnenteaza interfata direct
// dar face ceva similar. Definesc un field de tip Person. Apoi fac un constructor al cls care primeste param Person
//ac cls  nici nu are nevoie sa implementeze toate metodele din interfata (ca de fapt nu o mosteneste)
public class PersonData {
    //field de tipul definit in Interfata!!!
    private Person person;

    //constructor ce prim ca param field-ul de mai sus care e un fel de obiect ce poate fi condtruit /initializat cu orice (alta) cls ce implementeza interfata Person!!!
    public PersonData(Person person) {
        this.person = person;
    }

    //metoda proprie care rezova cerinta din tema
    //atentie mai jos pot apela metoda din interfata getBirthDate() pe obiect generic Person
    public int getAge() {
        LocalDate now = LocalDate.now();
        LocalDate birthDate = person.getBirthDate();

        Period between = Period.between(birthDate, now);
        return between.getYears();
    }
}
