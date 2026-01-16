import java.util.Scanner;
class Average
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers");
int num1 =sc.nextInt();
int num2 =sc.nextInt();
int num3 =sc.nextInt();
double average = (num1+num2+num3)/3;
System.out.println("The avaerage is "+average);
sc.close();
}
}
