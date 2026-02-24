import java.util.Scanner;
class SplitText
{
public static int findLength(String str)
{
int count=0;
char ch[]=new str.toCharArray();
for(char c:ch)
{
count++;
}
return count;
}
public static String[] splitString(String str)
{
int len=findLength(str);
int wordCount=1;
for(int i=0;i<len;i++)
{
if(str.charAt(i)==' ')
{
wordCount++;
}
}
int spaceIndexes[] = new int[wordCount-1];
int index=0;
for(int i=0;i<wordCount-1;i++)
{
if(str.charAt(i)==' ')
{
spaceIndexes[index++]=i;
}
}
String[] words = new String[wordCount];
int start=0;
for(int i=0;i<wordCount-1;i++)
{
words[i]=str.substring(start,spaceIndexes[i]);
start=spaceIndexes[i]+1;
}
words[wordCount-1]=str.substring(start,len);
return words;
}
public static boolean compare(String arr1[],String arr2[])
{
if(arr1.length!=arr2.length)
return false;
for(int i=0;i<arr1.length;i++)
{
if(!arr[i].equals(arr2[i]))
return false;
}
return true;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a sentence: ");
String str = sc.nextLine();
String customWords=splitString(str);
String builtinWords=str.split("  ");
boolean result = compare(customWords,builtinWords);
System.out.println("Words using custom split:");
for (String word : customWords) 
{
System.out.println(word);
}
System.out.println("Words using built-in split():");
for (String word : builtinWords) 
{
System.out.println(word);
}
System.out.println("\nAre both results same? " + result);
sc.close();
}
}


