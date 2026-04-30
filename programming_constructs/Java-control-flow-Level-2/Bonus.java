import java.util.Scanner;
class Bonus
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter salary");
double salary = sc.nextDouble();
System.out.println("Enter year of service");
int year = sc.nextInt();
if(year>5)
{
double bonus = (salary*5)/100;
System.out.println("Bonus : "+bonus);
}
else
{
System.out.println("No Bonus");
}
sc.close();
}
}
 