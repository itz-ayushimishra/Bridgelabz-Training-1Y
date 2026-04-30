import java.util.Scanner;
class Sum_Until_Zero
{
public static void main(String args[])
{
double total=0.0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
double num= sc.nextDouble();
while(num!=0)
{
total+=num;
System.out.println("Enter again");
num= sc.nextDouble();
}
System.out.println("The total value is: "+total);
sc.close();
}
}
