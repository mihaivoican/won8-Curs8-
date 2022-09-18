package inheritance.homework8.ex1;

public class Fridge extends Electronics{
    private float  temperature;

    public Fridge(){

    }
    public Fridge(int price,String name, String description,  int quantity,String type, int length, int width, int height, int weight,float temp){

        super(price,name,description,quantity,type,length, width, height, weight);
        this.temperature=temp;

    }

    @Override
    public void sellProduct(){
        setQuantity(this.getQuantity() -1);
        System.out.println(String.format("S-a vandut produsul electronic %s. Stoc nou %s",this.getName(),this.getQuantity()));
    }
}
