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


        //3.2 extract a Map that gathers all the persons for a company
        System.out.println("******************************");
        System.out.println(listEmpByComp(listaAngajati));

        //3.3 calculate the sum of all salaries for all employees
        System.out.println("Suma salariilor e: " + sumOfSalaries(listaAngajati));

        //3.4 calculate which company gives the biggest salary
        System.out.println("Compania cu cel mai mare salariu este.... " + bigestCompSalary(listaAngajati));
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

    public static Map<String,List<Employee>> listEmpByComp(List<Employee> emps){
        Map<String,List<Employee>> result = new HashMap<>();
        for (Employee e:emps){
            result.putIfAbsent(e.getCompany(),new ArrayList());
            result.get(e.getCompany()).add(e);
        }
        return result;
    }

    public static Integer sumOfSalaries(List<Employee> emps){
        Integer suma =0;
        for (Employee e:emps){
            suma += e.getSalary();
        }
        return suma;
    }

    public static String bigestCompSalary(List<Employee> emps){
        String comp = null;
        Integer sal = null;
        for (Employee e:emps){
            if (sal == null || sal < e.getSalary()){
                sal=e.getSalary();
                comp = e.getCompany();
            }
        }
        return comp;
    }

}
