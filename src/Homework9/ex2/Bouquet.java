package Homework9.ex2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bouquet {

     private Set<String> flori =new HashSet<String>();

    public Bouquet(Set<String> flori) {
        this.flori = flori;
    }

    public Set<String> getFlori() {
        return flori;
    }

    public Set<String> getAll(){
        return flori;
    }

    //adaug flori
    public void Add(String floare){
        flori.add(floare);
    }

    //elimin flori
    public boolean remove(String floare){

        boolean gasit = flori.contains(floare);
        if (gasit) {
            flori.remove(floare);
        }
        return gasit;
    }

}
