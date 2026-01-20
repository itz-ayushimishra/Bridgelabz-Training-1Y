import java.util.Scanner;
class No_Of_Handshakes
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students");
int noOfStudents=sc.nextInt();
double noOfHandshakes = (noOfStudents*(noOfStudents-1))/2;
System.out.println("The number of possible handshakes are "+noOfHandshakes);
sc.close();
}
}
