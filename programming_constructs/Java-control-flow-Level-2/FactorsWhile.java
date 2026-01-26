import java.util.Scanner;
class FactorsWhile
{
public static void main(String args[])
{
int i=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
if(num>0)
{
while(i<num)
{
if(num % i == 0)
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
 
