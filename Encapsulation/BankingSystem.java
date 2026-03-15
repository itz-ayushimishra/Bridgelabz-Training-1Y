abstract class BankAccount{

    private int accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(int acc,String name,double bal){
        accountNumber=acc;
        holderName=name;
        balance=bal;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    abstract double calculateInterest();
}

interface Loanable{
    void applyForLoan();
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable{

    public SavingsAccount(int acc,String name,double bal){
        super(acc,name,bal);
    }

    double calculateInterest(){
        return balance*0.04;
    }

    public void applyForLoan(){
        System.out.println("Loan Applied");
    }

    public double calculateLoanEligibility(){
        return balance*5;
    }
}

class CurrentAccount extends BankAccount{

    public CurrentAccount(int acc,String name,double bal){
        super(acc,name,bal);
    }

    double calculateInterest(){
        return balance*0.02;
    }
}