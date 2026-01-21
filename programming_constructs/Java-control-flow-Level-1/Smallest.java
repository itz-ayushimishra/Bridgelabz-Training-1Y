import java.util.Scanner;
class Smallest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

if(a<b&&a<c)
{
System.out.println("First number is smallest ");
}
else
{
System.out.println("First number is not smallest");
}
}
}
 
