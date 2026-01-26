import java.util.Scanner;
class Power
{
public static void main(String args[])
{
int result=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
System.out.println("Enter power");
int pow = sc.nextInt();
if(num>0)
{
for(int i=1;i<=pow;i++)
{
result=result*num;
}
}
System.out.println("Result = "+result);
sc.close();
}
}
