package example;
class SSLC{
    public void registernumber(int number){
        System.out.println("The SSLC  Register Number is "+number);
    }
}
class HSC extends SSLC{
    public void registernumber(int number){
        System.out.println("The HSC  Register Number is "+number);
    }
}
 class College {
    public void registernumber(int number){//SAME method same argument different classes
        System.out.println("The COLLEGE Register Number is   21CAB"+number);
    }


}
public class MethodOverriding {
    public static void main(String[] args) {
College Object=new College();
Object.registernumber(234);
    }
}
