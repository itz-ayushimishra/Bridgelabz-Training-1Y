package ExceptionHandling;

public class ExceptionPropagation {
    void method1(){
        int x=10/0;
    }
    void method2(){
        method1();
    }
}
