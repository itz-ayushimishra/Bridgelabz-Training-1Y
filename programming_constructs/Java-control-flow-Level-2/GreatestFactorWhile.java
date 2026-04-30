import java.util.Scanner;
class GreatestFactorWhile
{
public static void main(String args[])
{
int greatestFactor=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
int counter=num-1;
while(counter>=1)
{
if(num%counter==0)
{
greatestFactor=counter;
break;
}
counter--;
}
System.out.println("Greatest Factor = "+greatestFactor);
sc.close();
}
}

