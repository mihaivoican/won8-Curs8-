package inheritance.homework8.ex1;

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

        Electronics elect1 = new Electronics(5,10,20,15);
        elect1.setName("Philips");
        elect1.setDescription("LCD");
        elect1.setPrice(500);
        elect1.setQuantity(20);
        elect1.setType("TV");

        elect1.sellProduct();       //se apeleaza din parinte

        Fridge fridge = new Fridge(20,20,90,55,-20);
        fridge.setName("Samsung");
        fridge.setQuantity(35);
        fridge.setPrice(100);
        fridge.setType("no frost");

        fridge.sellProduct();


    }


}
