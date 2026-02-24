import java.util.Scanner;
public class LowerCase
{
public static String convertToLower(String str)
{
String result="";
for(int i=0;i<str.length();i++)
{
char ch = str.charAt(i);
if(ch>='A' && ch<='Z')
{
ch=(char)(ch+32);
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
String res1 = convertToLower(str);
String res2 = str.toLowerCase();
System.out.	println("Using method: "+res1);
System.out.println("Using built-in method: "+res2);
System.out.println("Are they same?: "+compare(res1,res2));
}
}

