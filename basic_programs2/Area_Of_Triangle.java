import java.util.Scanner;
class Area_Of_Triangle
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter base and height in cm");
double base =sc.nextDouble();
double height =sc.nextDouble();
double baseInch=base*0.394;
double heightInch=height*0.394;
double baseFeet=baseInch*0.0833;
double heightFeet=heightInch*0.0833;
double areaCm = 0.5*base*height;
double areaInch = 0.5*baseInch*heightInch;
double areaFeet = 0.5*baseFeet*heightFeet;
System.out.printf("Height in cm is %.2f while in inch is %.2f and feet is %.2f",height,heightInch,heightFeet);
System.out.printf("\nArea of triangle in cm is %.2f while in inches is %.2f and in feet is %.2f",areaCm,areaInch,areaFeet);
}
}