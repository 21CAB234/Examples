package example;

public class ElseIf {
    //else if
    public static void main(String[] args) {
        int number=10;
        if(number>0){
            System.out.println("It is Positive Number :"+number);
        } else if (number<0) {
            System.out.println("It is Negative Number :"+number);
        }
        else {
            System.out.println("The Number Is Zero");
        }
    }


}
