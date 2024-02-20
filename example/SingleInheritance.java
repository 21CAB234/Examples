package example;

class Parent{
    public void car(){
        System.out.println("Parent Propertity of Car ");
    }
}
public class SingleInheritance extends Parent{
    public void bike(){
        System.out.println("Child Propertity Of Bike");
    }
    public static void main(String[] args) {
        SingleInheritance object=new SingleInheritance();
        object.bike();//Child Class Method
        object.car();//Parent Class Method Call With Child Class Object
    }

}
