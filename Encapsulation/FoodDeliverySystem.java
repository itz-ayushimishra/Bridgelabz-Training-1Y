abstract class FoodItem{

    protected String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String name,double price,int q){
        itemName=name;
        this.price=price;
        quantity=q;
    }

    abstract double calculateTotalPrice();

    public void getItemDetails(){
        System.out.println(itemName+" "+price);
    }
}

interface Discountable{
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable{

    public VegItem(String name,double price,int q){
        super(name,price,q);
    }

    double calculateTotalPrice(){
        return price*quantity;
    }

    public double applyDiscount(){
        return calculateTotalPrice()*0.10;
    }

    public String getDiscountDetails(){
        return "10% Veg Discount";
    }
}

class NonVegItem extends FoodItem{

    public NonVegItem(String name,double price,int q){
        super(name,price,q);
    }

    double calculateTotalPrice(){
        return price*quantity+50;
    }
}