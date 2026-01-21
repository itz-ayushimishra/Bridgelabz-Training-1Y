import java.util.Scanner;
class Largest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

if(a>b&&a>c)
{
System.out.println("Is the first number the largest? YES");
}
else if(b>a&&b>c)
{
System.out.println("Is the second number the largest? YES");
}
else if(c>a&&c>b) 
{
System.out.println("Is the third number the largest? YES");
}
sc.close();
}
}
