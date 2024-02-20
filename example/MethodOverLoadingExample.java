package example;

public class MethodOverLoadingExample {
    public void add(int a,int b){
        int c=a+b;
        System.out.println("Sum Of "+a+" + "+b+" = "+c);
    }
    public void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println("Sum Of "+a+" + "+b+" + "+c+" = "+d);
    }

    public static void main(String[] args) {
        MethodOverLoadingExample Object=new MethodOverLoadingExample();
        Object.add(10,20,30);//Three Parameter
        Object.add(10,20);//Two Parameter
    }
}
