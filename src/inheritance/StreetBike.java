package inheritance;

public class StreetBike extends Bike{       //mosteneste cls Bike
    //field/atribut propriu
    private String color;

    //constructor
    public StreetBike(int tyrePressure, String color) {
        super(tyrePressure);
        System.out.println("Street bike constructor start");
        this.color = color;
        System.out.println("Street bike constructor end");
    }

    public String getColor() {
        return color;
    }

    @Override   //rescrie met din parinte
    public void honk(){ //actiunea de a claxona
//        super.honk();
        System.out.println("street bike hooonk");
    }

}
