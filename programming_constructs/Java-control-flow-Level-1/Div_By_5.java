import java.util.Scanner;
class Div_By_5
{
public static void main(String args[])
{
	int ld=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
if(num==0)
{
System.out.println("Entered number is zero");
}
ld = num%10;
if(ld==0||ld==5)
{
System.out.println(" Is the number "+num+" divisible by 5 "+YES);
}
else
{
System.out.println("Is the number "+num+" divisible by 5 "+NO);
}
}
}