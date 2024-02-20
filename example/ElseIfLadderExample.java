package example;

public class ElseIfLadderExample {
    public static void main(String[] args) {
        int mark=60;
        if(mark>=90){
            System.out.println("A+ Grade");
        }
        else if(mark>=80){
            System.out.println("A Grade ");
        }
        else if(mark>=70){
            System.out.println("B Grade");
        } else if (mark>=60) {
            System.out.println("C Grade ");
        }
        else if(mark>=45){
            System.out.println("Average ");
        }
        else {
            System.out.println("Fail ");
        }
    }
}
