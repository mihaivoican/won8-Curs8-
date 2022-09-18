package inheritance.main;

import inheritance.Bike;
import inheritance.StreetBike;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

      Bike bike = new Bike(30);       //instantiere Bike
        System.out.println("1--------------------");
        StreetBike streetBike = new StreetBike(35, "blue");         //instantiere streetBike

//        bike.honk();            //apelez met proprie
        streetBike.honk();      //idem
        System.out.println("2---------------------");
        Bike secondBike = new StreetBike(40, "black");      //instantiere Bike cu  constructor din cls copil!!!!
        secondBike.honk();      //va apela metoda din copil!!!
        System.out.println("3---------------------");
        System.out.println(((StreetBike)secondBike).getColor());            //se face un hard cast-> conversie hard de la Bike la streetBike; Aici a mers /uneori poate crapa!!!
        if(bike instanceof StreetBike){         //e metoda recomandata inainte de a face hard cast; verific cu if daca va da eroare la cast
            System.out.println("(4)entering bike");     // nu intra pe aici pt ca am instantiat un Bike !!! Atentie
            String color = ((StreetBike) secondBike).getColor();
        }
        else {
            System.out.println("(5)bike is not an instance of StreetBike");
        }
        if(secondBike instanceof StreetBike){         //e metoda recomandata inainte de a face hard cast; verific cu if daca va da eroare la cast
            System.out.println("(6)entering secondBike");     // nu intra pe aici pt ca am instantiat un Bike !!! Atentie
            String color = ((StreetBike) secondBike).getColor();
            System.out.println(color);
        }
        else {
            System.out.println("(7)secondBike not an instance of StreetBike");
        }


        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike(20);
        bikes[1] = new StreetBike(45, "white");
        bikes[2] = new Bike(39);
        for (int i = 0; i < bikes.length; i++) {
            bikes[i].honk();
        }

        increaseSpeed(bike);
        increaseSpeed(streetBike);
//        increaseSpeed(new PhysicalObject()); -- compile error

        doSomething(bike);
        doSomething(streetBike);
        doSomething(secondBike);
    }
    private static void doSomething(Object o){
        System.out.println(o.getClass());
    }

    private static void increaseSpeed(Bike bike) {
        bike.increaseSpeed();
    }

    private static void overloading(StreetBike streetBike) {
        System.out.println(streetBike.getSpeed());
        streetBike.increaseSpeed();
        System.out.println(streetBike.getSpeed());
        streetBike.increaseSpeed(8, 7);
        System.out.println(streetBike.getSpeed());
    }

    private static void overriding(Bike bike, StreetBike streetBike) {
        bike.honk();
        streetBike.honk();
    }

}
