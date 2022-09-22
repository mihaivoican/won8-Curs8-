package collections;

import java.util.*;

//Cplectiile SET sunt liste unice de elemente
//implementari HAshSet (nu se pot ordona) si TreeSet (se poate ordona)
public class SetExample {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);     //nu se va adauga in lista; dar nici eroare nu da
        set.add(0);
        set.add(3);
        set.add(123);
        set.add(234);

        System.out.println(set);

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");            //nu da eroare da-r nu-l va adauga a 2-a oara in lista
        cars.add("Mazda");
        System.out.println(cars);

        //caut daca exista un elem in lista
        cars.contains("Mazda");          //return True
        System.out.println(cars.contains("Mazda"));
        int marimeLista = cars.size();
        System.out.println(marimeLista);

        //parcurgere lista
        for (String i : cars) {
            System.out.println(i);
        }

        //scot elem din lista
        cars.remove("volvo");   //ac element nu e gasit fiindca nu e cu prima Majuscula!!!
        System.out.println(cars.size());

        cars.remove("Volvo");       //il va sterge
        System.out.println(cars.size());

        cars.clear();  //sterge toate elem din lista

        //TreeSet -alt tip de colectie SET ce se poate sorta
        //aici e mai complicat ex pt ca e o sortare descendenta
// alt ex de sortade descendenta la https://www.geeksforgeeks.org/how-to-sort-a-treeset-with-user-defined-objects-in-java/
        SortedSet<DescendingInteger> sortedSet = new TreeSet<>();
        sortedSet.add(new DescendingInteger(1));
        sortedSet.add(new DescendingInteger(2));
        sortedSet.add(new DescendingInteger(1));
        sortedSet.add(new DescendingInteger(0));
        sortedSet.add(new DescendingInteger(3));
        sortedSet.add(new DescendingInteger(123));
        sortedSet.add(new DescendingInteger(234));

        System.out.println(sortedSet);

        SortedSet<Integer> sorted = new TreeSet<>(new DescendingIntegerComparator());
        sorted.add(1);
        sorted.add(2);
        sorted.add(1);
        sorted.add(0);
        sorted.add(3);
        sorted.add(123);
        sorted.add(234);
        System.out.println(sorted);
    }

}
class DescendingIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class DescendingInteger implements Comparable<DescendingInteger> {
    private Integer value;

    public DescendingInteger(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int compareTo(DescendingInteger o) {
        return -(value - o.value);
    }
}
