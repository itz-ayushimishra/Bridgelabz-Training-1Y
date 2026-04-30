import java.util.Scanner;
class MultiplesWhile
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
int counter=100;
if(num>0&&num<100)
{
while(counter>=1)
{
if(counter%num==0)
{
System.out.println(counter);
}
counter--;
}
}
sc.close();
}
}
