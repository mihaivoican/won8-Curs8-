package Homework9.ex1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaFructe = new ArrayList();
        listaFructe.add("prune");
        listaFructe.add("mere");
        listaFructe.add("visine");
        listaFructe.add("caise");

        Basket cos = new Basket(listaFructe);
        System.out.println(cos.getCosFructe());

        //caut in cos
        System.out.println(String.format("Avem in cos %s? %b","pepene",cos.find("pepene")));
        System.out.println(String.format("Avem in cos %s? %b","mere",cos.find("mere")));

        //adaug in cos dublura visine
        System.out.println("adaug visine");
        listaFructe.add("visine");
        System.out.println(cos.getCosFructe());

        //elimin din cos 1 fruct
        System.out.println(String.format("Scot din cos %s. Rezultat: %s","visine",cos.remove("visine")));
        System.out.println(cos.getCosFructe());
        System.out.println(String.format("Scot din cos %s. Rezultat: %s","portocale",cos.remove("portocale")));
        System.out.println(cos.getCosFructe());

        //caut fruct in cos
        System.out.println(String.format("Fructul %s e pe pozitia %s", "pere", cos.position("pere")));
        System.out.println(String.format("Fructul %s e pe pozitia %s", "caise", cos.position("caise")));

        //adaug dublura /triplu ...
        listaFructe.add("prune");
        listaFructe.add("prune");
        System.out.println(cos.getCosFructe());

        //intorc lista unica de fructe; a iesit si sortata!!!
        System.out.println(cos.distinct());

        //nr elem din lista
        System.out.println(cos.getCosFructe());
        System.out.println(String.format("Cosul are %s fructe", cos.count()));

        //nr elem cu metoda custom
        System.out.println("La a doua numaratoare nr de fructe este: " + cos.customCount());
    }
}
