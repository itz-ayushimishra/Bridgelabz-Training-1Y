import java.util.Scanner;
class Power
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter base and exponent");
double base =sc.nextDouble();
double exponent =sc.nextDouble();
double power= Math.pow(base,exponent);
System.out.println("Required result base^exponent is  = "+power);
sc.close();
}
}
