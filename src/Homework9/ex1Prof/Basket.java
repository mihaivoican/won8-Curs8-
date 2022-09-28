package Homework9.ex1Prof;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Basket {
    //field pt Basket; doar declarat neinitializat
    //declaratie generica de lista
    private List<String> fruits;
    //cea de mai jos e un field extra, nenecesar pt tema initiala; adaugat pt demo la lectia 10
    private int maxCapacity;

    public static void main(String[] args) {
        //aici initializez lista
        List<String> strings = new ArrayList<>();
        //incarc lista de fructe
        strings.add("Mar");
        strings.add("Banana");
        int maxCapacity = 10;
        //initializez Basket cu lista mai sus creata
        Basket basket = new Basket(strings, maxCapacity);
        //linia urmatoare arata ca eu nu pot modifica din afara cosul; doar lista de fructe initiala; ca sa pastrez incapsularea; altfel lista fructe din cls degeaba e privata
        strings.add("Struguri");
        //linia urmatoare e doar pt debug
        System.out.println("");
        //asa se adauga corect in cos prin metoda clasei nu prin add la lista fructe
        basket.add("Para");
        System.out.println("");
    }

    //constructor cls
    public Basket(List<String> fruits, int maxCapacity) {
        //asa e corect ca sa am control total; sa refac lista in constreuctor, nu sa dau param pt initializare cos
        this.fruits = new ArrayList<>();
        //asa adaug din lista primita ca param in cos/in noua lista
        this.fruits.addAll(fruits);
        this.maxCapacity = maxCapacity;
    }

    //metoda de cautare fructe
    public boolean find(String fruit) {
        if (fruit == null) {
            return false;
        }
        return fruits.contains(fruit);
    }


    //metoda de adaugare in cos pe cls Basket
    public void add(String fruit) {
        if (fruit != null) {
            fruits.add(fruit);
        }
    }

    //returnez o lista distincta de fructe
    public Collection<String> distinct() {
        //atentie TreeSet deja creeaza o lista unica din lista fruits primita ca param
        return new TreeSet<>(fruits);
    }

    //getter pt field
    public int getMaxCapacity() {
        return maxCapacity;
    }

    //setter pt field
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
