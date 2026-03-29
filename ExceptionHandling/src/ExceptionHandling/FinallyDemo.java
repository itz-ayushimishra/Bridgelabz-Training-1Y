package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {
    void division() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter numerator:");
            int a = sc.nextInt();
            System.out.println("Enter denominator:");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Result:" + res);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Operation completed");
        }
    }
}
