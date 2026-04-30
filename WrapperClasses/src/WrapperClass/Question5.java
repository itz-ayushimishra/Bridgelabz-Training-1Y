package WrapperClass;

public class Question5 {
    static void main(String[] args) {
        int intVal=Integer.parseInt("123");
        System.out.println("String to integer: "+intVal);
        double doubleVal=Double.parseDouble("3.14");
        System.out.println("String to double: "+doubleVal);
        boolean boolVal=Boolean.parseBoolean("true");
        System.out.println("String to boolean: "+boolVal);
        String binary=Integer.toBinaryString(10);
        System.out.println("Integer to binary string: "+binary);
        boolean isDigit=Character.isDigit('5');
        System.out.println("Check if it is digit: "+isDigit);
        char upper=Character.toUpperCase('a');
        System.out.println("String to uppercase: "+upper);
    }
}
