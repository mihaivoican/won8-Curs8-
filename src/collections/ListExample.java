package collections;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        //cel mai folosit ex de lista ArrayList
        //permite dubluri
        //Quick for access, slow at insertion
        List<Integer> integers = new ArrayList<>();

        //adaug elemente in lista
        integers.add(1);
        integers.add(2);
        integers.add(1);
        System.out.println(integers);

        //regasire elem din lista dupa index (la fel ca la array, index pleaca cu 0)
        int nr = integers.get(2);
        System.out.println(nr);

        //schimbare/update elem din lista
        integers.set(2, 10);
        System.out.println(integers);

        //scoate element din lista, de la index-ul N
        //dupa stergere alt element ia locul/indexul acela. Lista se micsoreaza cu 1 element
        integers.remove(0);
        System.out.println(integers);

        //stergere toate elem din lista
        integers.clear();
        System.out.println(integers);

        //pt a afla cate elemente are  o lista
        int marime = integers.size();
        System.out.println(marime);
        integers.add(123);
        integers.add(22);
        System.out.println(integers.size());


        //parcurgere lista cu cicluri Loop
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        for (int i=0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("-----------------");

        //parcurgere lista cu for-each simplificat
        for (String c : cars) {
            System.out.println(c);
        }
        System.out.println("----------------------");

        //Iterator -> ajuta la parcurgerea listei/ si altor colectii
        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        //parcurg lista cu iteratorul
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("------------------------------");
        //caut un elem in lista
        cars.contains("BMW");
        System.out.println( cars.contains("BMW"));
        // ALTE tipuri de elemente /obiecte pot fi Boolean, Double, Character

//SORTARE pe ArrayList (numeric sau alfabetic) Prin Collection.sort
        Collections.sort(cars);          //sorteaza cars
        for (String ca : cars) {
            System.out.println(ca);
        }

        Collections.sort(integers);
        for (Integer i : integers) {
            System.out.println(i);
        }

        System.out.println("*****************************************************");


        //***** alt tip de lista LinkedList ********************
        //Slow for access, quick for insertion
        //se folos mai mult pt manipulare date; are niste metode in plus
        LinkedList<String> cars2 = new LinkedList<>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");

        System.out.println(cars2);

        //metode specifice
//adauga pe proma pozitie
        cars2.addFirst("Mazda");
        System.out.println(cars2);

        //regasire primul/ultimul element
        System.out.println(cars2.getFirst());
        System.out.println(cars2.getLast());
        // la fel removeFirst(), removeLast();
    }
}
