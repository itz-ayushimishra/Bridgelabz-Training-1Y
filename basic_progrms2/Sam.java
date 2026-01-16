import java.util.Scanner;
class Sam
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Maths Marks");
int math=sc.nextInt();
System.out.println("Enter Physics marks");
int physics=sc.nextInt();
System.out.println("Enter Chemistry marks");
int chemistry=sc.nextInt();
double average=(math+physics+chemistry)/3;
System.out.println("Sam's average in PCM is "+average);
}
}
