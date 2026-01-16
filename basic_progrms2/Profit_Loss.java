import java.util.Scanner;
class Profit_Loss
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter cost price");
double costPrice=sc.nextDouble();
System.out.println("Enter selling price");
double sellingPrice=sc.nextDouble();
double profit = sellingPrice-costPrice;
double profitPercentage=(profit/costPrice)*100;
System.out.printf("The Cost price is INR %.0f and Selling price is INR %.0f \n",costPrice,sellingPrice); 
System.out.printf("Profit is INR %.0f and the Profit percentage is %.2f ",profit,profitPercentage);
}
}
