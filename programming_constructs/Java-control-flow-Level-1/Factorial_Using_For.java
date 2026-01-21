import java.util.Scanner;
class Factorial_Using_For
{
public static void main(String args[])
{
int fact=1;
Scanner sc= new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
if(num>0)
{
if(num==0)
{
System.out.println("Factorial of "+num+" is "+fact);
}
for(int temp=num;temp>=1;temp--)
{
fact=fact*temp;
}
System.out.println("Factorial of "+num+" is "+fact);
}
else
{
System.out.println("You have entered negative number");
}
sc.close();
}
}
