package example;

class GrandFather{
    public void house(){
        System.out.println("GrandFather Propertity Of House ");
    }
}
class Father extends GrandFather{
    public void car(){
        System.out.println("Father Propertity Of Car ");
    }

}
class Son extends Father{
    public void moblie(){
        System.out.println("The Son Propertity Of Moblie ");
    }
}
public class Multi_Level_Inhetitance {
    public static void main(String[] args) {
        Son Object =new Son();
        Object.house();//GrandFather Class Method Call in Son Class Object
        Object.car();//Father Class Method Call in Son Class Object
        Object.moblie();//Son Class Method Call in Son Class Object
    }
}
