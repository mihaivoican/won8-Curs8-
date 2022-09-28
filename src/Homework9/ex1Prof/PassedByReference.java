package Homework9.ex1Prof;

import java.util.ArrayList;
// obiectele se transmit prin referinta
//primitivele prin valoare
public class PassedByReference {
    //n-are legatura cu exercitiul 1; e doar pt a ilustra cum se trimit param prin referinta sau valoare
    public static void main(String[] args) {
        Basket basket = new Basket(new ArrayList<>(), 5);
        doSomething(basket);
        System.out.println(basket.getMaxCapacity()); // intoarce 5!!
    }

    public static int doSomething(Basket basket){
        // other code
        return 10; // e doar local-> se transmite prin valoare
    }
}
