package example;

class Student{
    private String name="Parthasarathi";
    public String getname()
    {
        return name;
    }
    public void setname(String name){
        System.out.println(this.name=name);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
         /*private variable or method
          Do not access Directly So using Getter and Setter*/
        Student object=new Student();

        System.out.println("Before Change Student name is  "+  object.getname());
        object.setname("HARISH ");
        System.out.println("After Change Student name is  "+  object.getname());

    }
}
