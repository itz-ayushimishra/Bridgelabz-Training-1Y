import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number and second number");
int num1 =sc.nextInt();
int num2 =sc.nextInt();
int sum=num1+num2;
int sub=num1-num2;
double div=num1/num2;
int prod=num1*num2;
System.out.printf("The addition,subtraction,multiplication and division value of 2 numbers %d and %d is %d,%d,%d,%.2f",num1,num2,sum,sub,prod,div);
}
}
