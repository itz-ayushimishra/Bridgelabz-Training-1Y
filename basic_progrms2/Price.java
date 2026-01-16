import java.util.Scanner;
class Price
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the unit price and the quantity");
double unitPrice=sc.nextDouble();
int quantity=sc.nextInt();
double totalPrice = unitPrice*quantity;
System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f",totalPrice,quantity,unitPrice);
}
}
