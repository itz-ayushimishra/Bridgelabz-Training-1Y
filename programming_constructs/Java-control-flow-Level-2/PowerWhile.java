import java.util.Scanner;
class PowerWhile
{
public static void main(String args[])
{
int result=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
System.out.println("Enter power");
int pow = sc.nextInt();
int counter =1;
if(num>0)
{
while(counter<=pow)
{
result=result*num;
counter++;
}
}
System.out.println("Result = "+result);
sc.close();
}
}
