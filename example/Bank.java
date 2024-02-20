package example;
public class Bank {
    public void loan(){
        System.out.println("Customer loan");
    }
}
class Customer2 extends  Bank{
    public static void main(String[] args) {
        Customer2 object =new Customer2();
        object.loan();//second Customer Using loan
    }
}
class Customer1 extends Bank{
    public static void main(String[] args) {
        Customer1 object=new Customer1();
        object.loan();//First Customer Using money
    }
}


