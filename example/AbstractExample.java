package example;
abstract class Details {

    abstract public void name(String name);

    abstract public void age(int age);

    abstract public void department(String Department);

    abstract public void salary(int salary);
}
public class AbstractExample extends Details {

    public void name(String name){
        System.out.println("The Employee name is :"+name);
    }
    public void age(int age){
        System.out.println("The Employe Age Is :"+age);
    }

    public void department(String Department){
        System.out.println("The Employee Department :"+Department);
    }
    public void salary(int salary){
        System.out.println("The salary of Employee :"+salary);
    }

    public static void main(String[] args) {
        AbstractExample object =new AbstractExample();
        object.name("Employee");
        object.age(26);
        object.department("COMPUTER SCIENCE ");
        object.salary(60000);
    }
}


