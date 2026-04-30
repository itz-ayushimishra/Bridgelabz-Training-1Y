import java.util.Scanner;
class GradeCalculator
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks");
int phy = sc.nextInt();
int chem = sc.nextInt();
int math = sc.nextInt();
double avg = (phy+chem+math)/3.0;
System.out.println("Percentage = "+avg+" %");
if(avg>=80)
{
System.out.println("Grade : A");
System.out.println("Level 4,above agency-normalised standards ");
}
else if(avg>=70 && avg<=79)
{
System.out.println("Grade : B");
System.out.println("Level 3,at agency-normalised standards ");
}
else if(avg>=60 && avg<=69)
{
System.out.println("Grade : C");
System.out.println("Level 2,below,but approaching agency-normalised standards ");
}
else if(avg>=50 && avg<=59)
{
System.out.println("Grade : D");
System.out.println("Level 1,well below agency-normalised standards ");
}
else if(avg>=40 && avg<=49)
{
System.out.println("Grade : E");
System.out.println("Level 1-,too below agency-normalised standards ");
}
else if(avg<=39)
{
System.out.println("Grade : R");
System.out.println("Remedial standards");
}
sc.close();
}
}
