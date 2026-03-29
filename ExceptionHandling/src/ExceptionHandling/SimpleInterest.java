package ExceptionHandling;

public class SimpleInterest {
    double calculateSI(double amount,double rate,int years) throws IllegalArgumentException{
        if(amount<0||rate<0){
            throw new IllegalArgumentException();
        }
        return (amount*rate*years)/100;
    }
}
