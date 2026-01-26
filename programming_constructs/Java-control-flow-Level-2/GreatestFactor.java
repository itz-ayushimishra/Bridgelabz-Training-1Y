import java.util.Scanner;
class GreatestFactor
{
public static void main(String args[])
{
int greatestFactor=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
for(int i=num-1;i>=1;i--)
{
if(num%i==0)
{
greatestFactor=i;
break;
}
}
System.out.println("Greatest Factor = "+greatestFactor);
sc.close();
}
}

