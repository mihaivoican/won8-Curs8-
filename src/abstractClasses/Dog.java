package abstractClasses;

public class Dog extends  Animal{

    public Dog(int weight) {
        super(weight);
    }

    //metoda implementata
    @Override
    public String talk() {
        return "ham-ham";
    }
}
