package inheritance;

public class Vehicle extends PhysicalObject{        //mosteneste PhysicalObject
    private String licensePlate;

    //constructor
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override       //rescrie metodadin parinte
    public void fall() {
        System.out.println("A vehicle is falling!");
    }
}
