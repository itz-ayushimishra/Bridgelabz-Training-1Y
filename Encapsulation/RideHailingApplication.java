abstract class Vehicle{

    protected int vehicleId;
    protected String driverName;
    protected double ratePerKm;

    public Vehicle(int id,String driver,double rate){
        vehicleId=id;
        driverName=driver;
        ratePerKm=rate;
    }

    abstract double calculateFare(double distance);

    public void getVehicleDetails(){
        System.out.println(driverName+" driving vehicle "+vehicleId);
    }
}

interface GPS{
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS{

    String location;

    public Car(int id,String driver,double rate){
        super(id,driver,rate);
    }

    double calculateFare(double distance){
        return distance*ratePerKm;
    }

    public String getCurrentLocation(){
        return location;
    }

    public void updateLocation(String loc){
        location=loc;
    }
}

class Bike extends Vehicle{

    public Bike(int id,String driver,double rate){
        super(id,driver,rate);
    }

    double calculateFare(double distance){
        return distance*ratePerKm*0.8;
    }
}