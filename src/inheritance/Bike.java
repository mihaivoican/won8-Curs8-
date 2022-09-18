package inheritance;

public class Bike extends PhysicalObject{
    public int tyrePressure;
    private int speed;

    //constructor 1
    public Bike(int tyrePressure) {
        System.out.println("Bike constructor start");
        this.tyrePressure = tyrePressure;
        this.speed = 10;
        System.out.println("Bike constructor end");
    }

    //alt constructor 2
    public Bike(int tyrePressure, int speed) {
        this.tyrePressure = tyrePressure;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    //o metoda proprie, fara param
    public void increaseSpeed() {
        this.speed++;
    }

    //a alta metoda cu acelasi nume + 1 param-> overloading
    public void increaseSpeed(int amount) {
        System.out.println("with int");
        this.speed += amount;
    }

    //a treia metoda cu acelasi nume si 2 param
    public void increaseSpeed(int a, int b){
        System.out.println("Two ints");

    }

    //a 4-a metoda cu nr diferit de param (aici am nr variabil de param; de fapt va fi apelata la mai mult de 2 param
    public void increaseSpeed(int... a){
        if(a.length==2){
            System.out.println("you won 1mil!");
        }
        System.out.println("Variable number of params");
    }

    // alta implementare/overloading tot cu 1 param dar de alt tip
    public void increaseSpeed(long amount){
        System.out.println("with long");
        this.speed += amount;
    }
        //la fel ca cea de mai sus; cu alt tip de param
    public void increaseSpeed(byte amount){
        System.out.println("with byte");
        this.speed += amount;
    }

    // met cu 2 param de alt tip
    public void increaseSpeed(byte a, int b){
        System.out.println("with byte");
        this.speed += a;
    }

    //la fel ca mai sus dar param de alt tip
    public void increaseSpeed(int b, byte a){
        System.out.println("with byte");
        this.speed += a;
    }

//alta metoda
    public void honk() {
        System.out.println("bike hooooonk");
    }

    @Override  //rescrie met din parinte
    public void fall() {
        System.out.println("");
    }
}
