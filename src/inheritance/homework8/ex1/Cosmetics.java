package inheritance.homework8.ex1;

public class Cosmetics extends Product{
    private String color;
    private  float weight;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }


    public void hasTester(boolean tester){
        if(tester){
            System.out.println("Are tester");
        }else{
            System.out.println("Nu are tester");
        }
    }
    @Override
    public void sellProduct(){
        setQuantity(this.getQuantity() -1);
        System.out.println(String.format("S-a vandut produsul cosmetic %s. Stoc nou %s",this.getName(),this.getQuantity()));
    }

    //overloading
    public void sellProduct(int cantitate){
        setQuantity(this.getQuantity() - cantitate);
        System.out.println(String.format("S-a vandut produsul cosmetic %s in cantitate de %s. Stoc nou %s",this.getName(),cantitate,this.getQuantity()));
    }


}
