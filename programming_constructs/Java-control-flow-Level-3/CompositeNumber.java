import java.util.Scanner;
class CompositeNumber
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
int sum=0;
int originalNumber=num;
while(num!=0)
{
int ld = num%10;
sum+=ld*ld*ld;
num=num/10;
}
if(sum==originalNumber)
System.out.println("Armstrong Number");
else
System.out.println("Not an Armstrong Number");
sc.close();
}
}
