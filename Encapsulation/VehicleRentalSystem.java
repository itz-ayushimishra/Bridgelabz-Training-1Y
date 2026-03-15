abstract class Vehicle{

    protected String vehicleNumber;
    protected String type;
    protected double rentalRate;

    public Vehicle(String num,String type,double rate){
        this.vehicleNumber=num;
        this.type=type;
        this.rentalRate=rate;
    }

    abstract double calculateRentalCost(int days);
}

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable{

    public Car(String num,double rate){
        super(num,"Car",rate);
    }

    double calculateRentalCost(int days){
        return rentalRate*days;
    }

    public double calculateInsurance(){
        return 500;
    }

    public String getInsuranceDetails(){
        return "Car Insurance";
    }
}

class Bike extends Vehicle{

    public Bike(String num,double rate){
        super(num,"Bike",rate);
    }

    double calculateRentalCost(int days){
        return rentalRate*days;
    }
}