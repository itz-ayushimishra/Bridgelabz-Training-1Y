package ExceptionHandling;

public class NestedTryCatch {
    void divInArray(){
        int[] arr={10,20,30,40,50};
        try{
            int index=2;
            int divisor=0;
            try{
                int result=arr[index]/divisor;
                System.out.println("Result is "+result);
            }
            catch(ArithmeticException e){
                System.out.println("Cannot divide by zero!");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index!");
        }
    }
}
