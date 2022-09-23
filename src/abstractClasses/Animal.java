package abstractClasses;

public abstract class Animal {
    //seamana cu o interfata dar poate contine si state  => field-uri si behavior => metode
    private int weight;

    //constructor -el e doar mostenit in subcls
    public Animal(int weight) {
        this.weight = weight;
    }

    //metoda cu body
    public int getWeight() {
        return weight;
    }

    //metoda abstracta
    abstract public String talk();
}
