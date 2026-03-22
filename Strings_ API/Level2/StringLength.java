import java.util.Scanner;
class StringLength
{
public static int findLength(String str)
{
int count=0;
char ch[]=str.toCharArray();
for(char c : ch)
{
count++;
}
return count;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.next();
int res1=findLength(str);
int res2=str.length();
System.out.println("Using method: "+res1);
System.out.println("Using Bulit-in Method "+res2);
}
}

