import java.util.Scanner;
class Rect_Perimeter
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter length and breadth");
double length =sc.nextDouble();
double breadth =sc.nextDouble();
double perimeter = 2*(length+breadth);
System.out.println("Perimeter of given rectangle is  = "+perimeter);
sc.close();
}
}
