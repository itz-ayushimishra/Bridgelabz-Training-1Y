import java.util.Scanner;
public class UpperCase
{
public static String convertToUpper(String str)
{
String result="";
for(int i=0;i<str.length();i++)
{
char ch = str.charAt(i);
if(ch>='a' && ch<='z')
{
ch=(char)(ch-32);
}
result=result+ch;
}
return result;
}
public static boolean compare(String s1,String s2)
{
return s1.equals(s2);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter text: ");
String str = sc.nextLine();
String res1 = convertToUpper(str);
String res2 = str.toUpperCase();
System.out.	println("Using method: "+res1);
System.out.println("Using built-in method: "+res2);
System.out.println("Are they same?: "+compare(res1,res2));
}
}

