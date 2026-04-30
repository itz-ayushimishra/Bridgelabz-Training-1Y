import java.util.Scanner;
class HarshadNumber
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
int sum=0;
int temp=num;
while(temp!=0)
{
int ld=temp%10;
sum+=ld;
temp=temp/10;
}
if(num%sum==0)
System.out.println("Harshad Number");
else
System.out.println("Not a Harshad Number");
sc.close();
}
}
