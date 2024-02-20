package example;
interface FirstInterface{
    public void firstinterface();

}
interface SecondInterface{
    public void secondinterface();

}
public class InterfaceExample implements FirstInterface,SecondInterface{
    @Override
    public void secondinterface() {
        System.out.println("Second Interface Method Override");
    }

    @Override
    public void firstinterface() {
        System.out.println("First InterFace Method Override");
    }

    public static void main(String[] args) {
        InterfaceExample object=new InterfaceExample();
        object.firstinterface();
        object.secondinterface();
    }
}
