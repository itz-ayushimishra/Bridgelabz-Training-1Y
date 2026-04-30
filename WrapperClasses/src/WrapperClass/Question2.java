package WrapperClass;

public class Question2 {
    public void wrapperToPrimitve() {
        Double num1 = 45.67;
        double num2 = num1;
        int num3 = (int)num2;
        System.out.println("Wrapper:- " + num1);
        System.out.println("Primitive:- " + num2);
        System.out.println("Casting to int:- " + num3);
    }
    public static void main(String[] args) {
        Question2 q = new Question2();
        q.wrapperToPrimitve();
    }
}
