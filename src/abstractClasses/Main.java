package abstractClasses;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog(10);
        Animal a2 = new Cat(3);

        System.out.println(a1.talk());
        System.out.println(a2.talk());
    }
}
