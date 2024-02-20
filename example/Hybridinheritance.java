package example;

class Grandfather{
    public void house(){
        System.out.println("The House is GrandFather Propertity ");
    }
}
class Mother extends Grandfather{
    public void land(){
        System.out.println("The land Is Mother Propertity");
    }
}
class SOn extends Mother{//hyrichcal Inheritance
   public void phone(){
       System.out.println("The Moblie is Son Moblie");
   }
}
class Dauther extends Mother{//hyrichcal Inheritance
   public void bag(){
       System.out.println("the Dauther Bag");
   }
}
public class Hybridinheritance {
    public static void main(String[] args) {
        Dauther object1=new Dauther();//Method Calling Dauther Class Object
        object1.land();
        object1.house();
        object1.bag();
        SOn Object2=new SOn();//Method Calling Son Class Object
        Object2.phone();
        Object2.land();
        Object2.house();
    }
}
