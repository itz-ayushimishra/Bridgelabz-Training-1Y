import java.util.Scanner;
class IntOperation
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers");
int a =sc.nextInt();
int b =sc.nextInt();
int c =sc.nextInt();
int res1=a+b*c;
int res2=a*b+c;
int res3=c+a/b;
int res4=a%b+c;
System.out.println("Result 1 = "+res1+"\n"+"Result 2 = "+res2+"\n"+"Result 3 = "+res3+"\n"+"Result 4 = "+res4);
sc.close();
}
}
