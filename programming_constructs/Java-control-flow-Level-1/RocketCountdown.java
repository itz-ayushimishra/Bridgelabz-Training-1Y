import java.util.Scanner;
class RocketCountdown
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the counter value");
int counter = sc.nextInt();
while(counter>=1)
{
System.out.println(counter);
counter--;
}
System.out.println("Launch!");
sc.close();
}
}