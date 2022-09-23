package Homework9.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Basket {

    private List<String> cosFructe = new ArrayList<>();


    public Basket(List<String> cosFructe) {
        this.cosFructe = cosFructe;
    }

    public List<String> getCosFructe() {
        return cosFructe;
    }

    //cautare in cos
    public boolean find(String fruct) {
        return this.getCosFructe().contains(fruct);

    }

    // eliminare din cos
    public boolean remove(String fruct) {
        int marimeInitial = cosFructe.size();
        boolean gasit = false;
        //caut pana nu mai gasesc; ca se poate sa fie de mai multe ori
        do {
            gasit = this.getCosFructe().contains(fruct);
            if (gasit) {
                cosFructe.remove(fruct);
            }
        } while (gasit);

        if (cosFructe.size() == marimeInitial) {
            return false;
        } else {
            return true;
        }
    }

    //intorc pozitia fructului
    public int position(String fruct) {
        for (int i = 0; i < cosFructe.size(); i++) {
            if (cosFructe.get(i).equals(fruct)) {
                return i;
            }
        }
        return -1;      //n-am gasit
    }

    //intorc o lista distincta de fructe
    public TreeSet<String> distinct() {
        TreeSet<String> fructeUnice = new TreeSet<>();
        for (String fruct : cosFructe) {
            fructeUnice.add(fruct);
        }
        return fructeUnice;
    }

    //intorc nr elem din cos/lista
    public int count() {
        return cosFructe.size();
    }

    //nr elem din cos -metoda custom
    public int customCount() {
        Iterator<String> it = cosFructe.iterator();
        int counter = 0;
        while (it.hasNext()) {
            counter++;
            it.next();
        }
        return counter;
    }


}
