package inheritance.homework8.ex1;

public class Product {
    private float price;
    private String name;
    private String description;
    private int quantity;

    public Product(float price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public Product(){

    }

    public void sellProduct(){
        if (quantity >0) {
            quantity--;
            System.out.println("S-a vandut 1 " + this.name + ". Stoc nou: " +quantity);
        }else{
            System.out.println("Stocul la produsul " +this.name +" =0. Nu se mai poate vinde! ");
        }
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }
}
