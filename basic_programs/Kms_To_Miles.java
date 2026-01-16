import java.util.Scanner;
class Kms_To_Miles
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter distance in kms");
double km = sc.nextDouble();
double miles=km*0.621371;
System.out.println("The distance "+km+" km in miles is "+miles);
}
}
