import java.util.Scanner;
class Height
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the height in cms");
double height=sc.nextDouble();
double heightInch=height*0.394;
double heightFeet=heightInch*0.0833;
System.out.printf("Your height in cm is %.2f while in feet is %.2f and inches is %.2f",height,heightFeet,heightInch);
}
}