package example;

public class ThreadExample extends Thread {

    public static void main(String[] args) {
ThreadExample t1=new ThreadExample();

t1.setName("MyThread");
t1.setPriority(1);
        t1.start();
        System.out.println("The Thread name is :"+t1.getName());
        System.out.println("The Priority of Thread is :"+t1.getPriority());
        System.out.println("The Thread  State is :"+t1.getState());

        for (int i=1;i<=20;i++){
            System.out.println("Main Method Loop "+i);
        }

    }
public void run(){
        for (int i=1;i<=20;i++){
            System.out.println("Run Method Loop "+i);
        }
}
}
