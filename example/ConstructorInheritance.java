package example;
class ParentConstructor{
    ParentConstructor(){
        System.out.println("This is Parent class Default Constructor ");
    }
    ParentConstructor(String any){
        System.out.println("This is Parent class Parameter Constructor "+any);
    }
}
public class ConstructorInheritance extends ParentConstructor {
    ConstructorInheritance(){

        System.out.println("This is Child class Default Constructor ");
    }
    ConstructorInheritance(String any){
        super("With Super Keyword ");
        System.out.println("This is Child class Parameter Constructor "+any);
    }
    public static void main(String[] args) {
        ConstructorInheritance object=new ConstructorInheritance();//ParentConstructor was Automatically Called
       ConstructorInheritance Object2=new ConstructorInheritance("Parameter Constructor ");
    }

}
