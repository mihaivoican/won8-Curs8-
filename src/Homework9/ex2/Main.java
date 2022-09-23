package Homework9.ex2;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> listaFlori = new HashSet<>();
        listaFlori.add("liliac");
        listaFlori.add("garoafa");
        listaFlori.add("lalea");
        listaFlori.add("ghiocel");
        listaFlori.add("narcisa");
        listaFlori.add("liliac");       //dublura => nu va intra in buchet

        Bouquet buchet = new Bouquet(listaFlori);

        System.out.println(buchet.getFlori());
        System.out.println(buchet.getAll());

        //adaug floare
        buchet.Add("trandafir");
        System.out.println(buchet.getAll());
        //adaug lalea => nu mai intra
        buchet.Add("lalea");
        System.out.println(buchet.getAll());

        //elimin floare
        System.out.println(String.format("Elimin din buchet liliac. Rezultat: %b",buchet.remove("liliac")));
        System.out.println(buchet.getAll());
        System.out.println(String.format("Elimin din buchet zambila. Rezultat: %b",buchet.remove("zambila")));
        System.out.println(buchet.getAll());


    }
}
