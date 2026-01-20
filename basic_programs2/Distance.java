import java.util.Scanner;
class Distance                                                                                                                                                                                                                            
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the distance in feet");
double distanceInFeet=sc.nextDouble();
double distanceInYards=distanceInFeet*0.333;
double distanceInMiles=distanceInFeet*0.000189;
System.out.printf("The distance in feet is %.0f while in yards is %.2f and miles is %.4f",distanceInFeet,distanceInYards,distanceInMiles);
}
}