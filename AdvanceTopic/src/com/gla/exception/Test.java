package com.gla.exception;

public class Test {
    public static void arithmeticException(){
        int a=10;
        int b=0;
        String s=null;
        try{
            double res=a/b;
            System.out.println(res);
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program ended");
        }
    }
    public static void nullPointerException(){
        try{
            String s1=null;
            String s2=null;
            System.out.println(s1.equals(s2));
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program ended");
        }
    }
    public static void arrayIndexOutOfBound()
    {
        int arr[]={1,2,3,4,5};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program ended");
        }
    }
    public static void stringIndexOutOfBound()
    {
        String s1="ayushi";
        try{
            System.out.println(s1.charAt(7));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Har baar run hoga yeh!");
        }
    }

    public static void main(String[] args) {
        arithmeticException();
        nullPointerException();
        arrayIndexOutOfBound();
        stringIndexOutOfBound();
    }
}
