package example;

public class Exceptionhandling {
    public static void main(String[] args)throws Exception {
        int firstno=10,secondno=0;
        try{
            System.out.println(firstno/secondno);
        }
        catch (ArithmeticException e){
            System.out.println("Anything can't Divide By Zero ");
        }

    }
}
