package example;

public class ConstructorOverloading {
    ConstructorOverloading(int a,int b){
        int c=a+b;
        System.out.println("Sum Of  "+a+" "+b+" = "+c);
    }
    ConstructorOverloading(String name,String Regno){
        System.out.println("Your Name Is :"+name+" And Your Regno Is :"+Regno);
    }
}
