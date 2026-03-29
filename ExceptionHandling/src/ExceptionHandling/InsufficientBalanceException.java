package ExceptionHandling;

public class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class BankAccount{
    double balance;
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount < 0){
            throw new IllegalArgumentException("Illegal amount!");
        }
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance = balance - amount;
        System.out.println("Withdrawal successful,new balance is " + balance);
    }
}
