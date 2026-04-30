import java.util.Scanner;
class YoungestAndTallest
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter age of Amar, Akbar and Anthony respectively");
int age1 = sc.nextInt();
int age2 = sc.nextInt();
int age3 = sc.nextInt();
System.out.println("Enter heights of Amar, Akbar and Anthony respectively");
int height1 = sc.nextInt();
int height2 = sc.nextInt();
int height3 = sc.nextInt();
if(age1<age2 && age1<age3)
System.out.println("Youngest is Amar (age= " +age1+ ")");
else if(age2<age1 && age2<age3)
System.out.println("Youngest is Akbar (age= " +age2+ ")");
else if(age3<age2 && age3<age1)
System.out.println("Youngest is Anthony (age= " +age3+ ")");
if(height1>height2 && height1>height3)
System.out.println("Tallest is Amar (height= " +height1+ ")");
else if(height2>height3 && height2>height3)
System.out.println("Tallest is Akbar (height= " +height2+ ")");
else if(height3>height1 && height2>height3)
System.out.println("Tallest is Anthony (height= " +height3+ ")");
sc.close();
}
}
