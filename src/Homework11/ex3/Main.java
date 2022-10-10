package Homework11.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Georgescu",25,"blond","RAR",5000);
        List<Employee> listaAngajati= new ArrayList<>();
        listaAngajati.add(emp);
        listaAngajati.add(new Employee("Ivanescu",44,"alb","Nokia",7000));
        listaAngajati.add(new Employee("Isarescu",64,"alb","BNR",100000));
        listaAngajati.add(new Employee("Alimanescu",24,"alb","NoName",1000));
        listaAngajati.add(new Employee("Zamfir",44,"brunet","Opel",6000));
        listaAngajati.add(new Employee("Ivanenco",54,"roscat","Nokia",8000));
//        listaAngajati.add(new Employee("Ivanescu",44,"alb","Nokia",7000));


        //3.1 extract persons that have salaries more than a specified ammount
        System.out.println(listSalGreater(4999,listaAngajati));


    }


    public static Map<String,Integer> listSalGreater(int sal,List<Employee> emps){
        Map<String,Integer> result = new HashMap<>();
        for (Employee e:emps){
            if (e.getSalary() > sal){
                result.putIfAbsent(e.name(),e.getSalary());
            }
        }
        return result;
    }

}
