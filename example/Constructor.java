package example;

public class Constructor {
    Constructor(){//Default Constructor
        System.out.println("Constructor Called ");
    }
    Constructor(String name){//ParameterRized Constructor
        System.out.println("It is a "+name);
    }

    public static void main(String[] args) {
        Constructor Object =new Constructor();
        Constructor Object1=new Constructor("Sting ");
    }
}
