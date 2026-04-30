import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter an year");
int year = sc.nextInt();
if(year>1582)
{
if(year%400==0)
{
System.out.println("Using multiple if-else : Year is a Leap Year");
}
else if(year%100==0)
{
System.out.println("Using multiple if-else : Year is NOT a Leap Year");
}
else if(year%4==0)
{
System.out.println("Using multiple if-else : Year is a Leap Year");
}
if(year%4==0&&year%100!=0 || year%400==0)
{
System.out.println("Using single if-else : Year is a Leap Year");
}
else
{
System.out.println("Using single if-else : Year is NOT a Leap Year");
}
}
sc.close();
}
}

