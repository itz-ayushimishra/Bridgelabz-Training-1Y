import java.util.Scanner;
class Kilometer_To_Miles
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter distance in kms");
double km = sc.nextDouble();
double miles=km*0.6;
System.out.println("The distance "+km+" km in miles is "+miles);
}
}
