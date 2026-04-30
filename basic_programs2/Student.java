import java.util.Scanner;
class Student
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter no. of students");
int student=sc.nextInt();
System.out.println("Enter no. of pens");
int pen=sc.nextInt();
int que=student/pen;
int rem=student%pen;
System.out.println("The pen per student is "+que+" and the remaining pen not distributed is "+rem);
}
}