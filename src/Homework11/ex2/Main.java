package Homework11.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //2. you have a list of Person :  Person(name, age, hair colour).
        Person p1 = new Person("Ionescu", 22, "blond");

        List<Person> pers = new ArrayList<Person>();
        pers.add(new Person("Vasilescu", 90, "alb"));
        pers.add(new Person("Georgescu", 40, "roscat"));
        pers.add(new Person("Zamfir", 60, "carunt"));
        pers.add(new Person("Stoica", 62, "carunt"));
        pers.add(new Person("Iliescu", 45, "saten"));
        pers.add(new Person("Simion", 40, "brunet"));

        //        2.1 extract the list of person names
        System.out.println("**********************************");
        for (Person p : pers) {
            System.out.println(p.name());
        }

        //2.2 create a map from person's name to their age
        Map<String,Integer> nameToAge =new HashMap<>();
        for (Person p : pers) {
            nameToAge.putIfAbsent(p.name(),p.age());
        }
        System.out.println(nameToAge);



        //2.3 extract the persons that are older than a given age
        System.out.println("***************************************************");
        Map<String,Integer> pOlder = persOlderThanAge(pers,45);
        System.out.println(pOlder);

        //2.4 extract a map from person's hair colour to their name (String->List<String>)
        System.out.println("***************************************************");
        Map<String,List<String>> hairColorToName = new HashMap<>();
        for (Person p:pers){
            if (!hairColorToName.containsKey(p.hairColour())){
                hairColorToName.put(p.hairColour(),new ArrayList<>());
            }
            hairColorToName.get(p.hairColour()).add(p.name());
        }
        System.out.println(hairColorToName);

        //2.5 create a map from age to list of persons
        System.out.println("******************************************");
        Map<Integer,List<String>> ageToPerson = new HashMap<>();
        for (Person p:pers){
            ageToPerson.putIfAbsent(p.age(),new ArrayList<>());
            ageToPerson.get(p.age()).add(p.name());
        }
        System.out.println(ageToPerson);

    }

    public static Map<String,Integer> persOlderThanAge(List<Person> pers, Integer varstaEtalon) {
        Map<String,Integer> persOlder = new HashMap<>();
        for (Person p: pers){
            if (p.age() >varstaEtalon){
                persOlder.putIfAbsent(p.name(),p.age());
            }
        }
        return persOlder;
    }




}
