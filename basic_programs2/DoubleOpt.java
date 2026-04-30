import java.util.Scanner;
class DoubleOpt
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers");
double a =sc.nextDouble();
double b =sc.nextDouble();
double c =sc.nextDouble();
double res1=a+b*c;
double res2=a*b+c;
double res3=c+a/b;
double res4=a%b+c;
System.out.println("Result 1 = "+res1+"\n"+"Result 2 = "+res2+"\n"+"Result 3 = "+res3+"\n"+"Result 4 = "+res4);
sc.close();
}
}
