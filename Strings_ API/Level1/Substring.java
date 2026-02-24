import java.util.Scanner;
class Substring
{
public static String createSubstring(String str,int start,int end)
{
String result="";
for(int i = start;i<end;i++)
{
result=result+str.charAt(i);
}
return result;
}
public static boolean compareStrings(String s1,String s2)
{
 return s1.equals(s2);
}
 public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter string: ");
String str = sc.next();
System.out.print("Enter starting index: ");
int start = sc.nextInt();
System.out.print("Enter ending index: ");
int end = sc.nextInt();
String sub1 = createSubstring(str, start, end);
String sub2 = str.substring(start, end);
System.out.println("Using charAt(): " +sub1);
System.out.println("Using substring(): " +sub2);
System.out.println("Are they equal? " +compareStrings(sub1, sub2));
}
}
