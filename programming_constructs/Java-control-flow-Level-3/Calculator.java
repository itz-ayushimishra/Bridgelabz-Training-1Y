import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
double first = sc.nextDouble();
double second = sc.nextDouble();
System.out.println("Enter the operator");
String op = sc.next();
switch(op)
{
case "+":
{
System.out.println(first+second);
break;
}
case "-":
{
System.out.println(first-second);
break;
}
case "*":
{
System.out.println(first*second);
break;
}
case "/":
{
if(second!=0)
System.out.println(first/second);
else
System.out.println("Division by zero is not possible");
break;
}
default:
System.out.println("Invalid Operator");
}
sc.close();
}
}
