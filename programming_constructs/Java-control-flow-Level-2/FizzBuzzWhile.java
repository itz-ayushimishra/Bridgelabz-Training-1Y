import java.util.Scanner;
class FizzBuzzWhile
{
public static void main(String args[])
{
int i=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
if(num>=1)
{
while(i<=num)
{
if(i%3==0 && i%5==0)
{
System.out.println("FizzBuzz");
}
else if(i%5==0)
{
System.out.println("Buzz");
}
else if(i%3==0)
{
System.out.println("Fizz");
}
else
{
System.out.println(i);
}
i++;
}
}
else
{
System.out.println("Enter a positive number!");
}
sc.close();
}
}
 