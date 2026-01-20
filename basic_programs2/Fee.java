import java.util.Scanner;
class Fee
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the fee and the discount");
int fee=sc.nextInt();
int discountPercent = sc.nextInt();
double discount= (fee*discountPercent)/100;
double disFee = fee-discount;
System.out.printf("The discount amount is INR %.2f and final discount is INR %.2f",discount,disFee);
}
}

