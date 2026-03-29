package ExceptionHandling;

public class Runner {
    public static void main(String[] args) {
        Division d1=new Division();
        d1.divide();

        Array a1=new Array();
        a1.getValue();

        SimpleInterest s1=new SimpleInterest();
        try{
            double interest = s1.calculateSI(1000,5,2);
            System.out.println("Interest is "+interest);
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid input: Amount and rate must be positive");
        }

        ExceptionPropagation e1=new ExceptionPropagation();
        try{
            e1.method2();
        }
        catch(ArithmeticException e){
            System.out.println("Handled exception in main");
        }

        NestedTryCatch n1=new NestedTryCatch();
        n1.divInArray();

        BankAccount b1=new BankAccount();
        try{
            b1.withdraw(1500);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
