package ExceptionHandling;

public class Array {
    void getValue(){
        int[] arr={10,20,30,40,50};
        int index=10;
        try{
            System.out.println("Value at index " +index+ " is: " +arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        catch(NullPointerException e){
            System.out.println("Array is not initilized");
        }
    }
}
