import java.util.Scanner;
class Volume_Of_Earth
{
public static void main(String[] args)
{
double pi=3.14;
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius of Earth in kms");
double radKm =  sc.nextInt();
double radMile = 0.6*radKm;
double volumeKm =  (4.0/3.0)*pi*(Math.pow(radKm,3));
double volumeMile =  (4.0/3.0)*pi*(Math.pow(radMile,3));
System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f",volumeKm,volumeMile);
}
}