import java.util.Scanner;
class Compare_Sum_Of_Natural_Nos
{
public static void main(String args[])
{
int sum=0;
int sum2=0;
int i=1;
Scanner sc= new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
if(num>0)
{
sum=(num*(num+1)/2);
System.out.println("Sum using formula is: "+sum);
while(i<=num)
{
sum2=sum2+i;
i++;
}
System.out.println("Sum using while loop is: "+sum2);
if(sum==sum2)
{
System.out.println("Both results are equal");
}
else
{
System.out.println("Both results are not equal");
}
}
else 
{
System.out.println("Entered number is not a natural number");
}
sc.close();
}
}




