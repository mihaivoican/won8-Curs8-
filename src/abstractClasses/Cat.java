package abstractClasses;

public class Cat extends Animal{
    //constructor ce apeleaza pe cel din cls superioara
    public Cat(int weight) {
        super(weight);
    }

    //rescrie/implementeaza metoda din parinte
    @Override
    public String talk() {
        return "miau";
    }
}
