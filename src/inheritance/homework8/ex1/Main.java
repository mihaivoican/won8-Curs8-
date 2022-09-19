package inheritance.homework8.ex1;

import inheritance.Bike;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product();
        prod1.setName("bax");
        prod1.setDescription("cutie produse");
        prod1.setPrice(150);
        prod1.setQuantity(3);

        //vanzare produs parinte
        prod1.sellProduct();

        Cosmetics cosm1 = new Cosmetics();
        cosm1.setName("sapun");
        cosm1.setDescription("Dove");
        cosm1.setPrice(2);
        cosm1.setQuantity(100);
        cosm1.setColor("roz");
        cosm1.setWeight(0.5f);

        cosm1.sellProduct();
        cosm1.sellProduct(10);

        cosm1.hasTester(false);

        System.out.println("------------");
        Product cosm2 = new Cosmetics();
        cosm2.setName("parfum");
        cosm2.setDescription("Chanel");
        cosm2.setQuantity(10);
        cosm2.setPrice(120);

        cosm2.sellProduct();        //se apeleaza din copil

        //setez si aduc field din copil
        if (cosm2 instanceof Cosmetics) {
            ((Cosmetics) cosm2).setColor("auriu");
            System.out.println(String.format("Culoarea la %s este %s", cosm2.getName(), ((Cosmetics) cosm2).getColor()));
        }

        Electronics elect1 = new Electronics(500,"Philips","LCD",20,"TV",5, 10, 20, 15);

        elect1.sellProduct();       //se apeleaza din parinte

        Fridge fridge = new Fridge(99,"Arctic","2 usi",120,"no frost", 20,20, 90, 55, -20);

        fridge.setQuantity(35);

        fridge.setType("no frost");

        fridge.sellProduct();
        System.out.println("----------------");
        Product[] produs = new Product[3];
        produs[0] = new Product(3, "cutie", "clasica", 2);
        produs[1] = new Electronics(200, "Sony","TV", 10, "LED", 5, 45, 30, 10);
        produs[2] = new Fridge(88,"Samsung","2 usi",150,"no frost", 35, 35, 65, 45, -15.5f);
        produs[2].setQuantity(30);

        for (int i = 0; i < produs.length; i++) {
            produs[i].sellProduct();

        }

    }


}
