package example;

public class StringExample {

    public static void main(String[] args) {
        System.out.println("String Buffer ");
        StringBuffer sb=new StringBuffer("RAVI");
        System.out.println("Before Edit The String "+sb.hashCode());
        System.out.println("Length Of String :"+sb.length());
        sb.replace(0,1,"P");
        System.out.println("After Replace The String :"+sb);
        sb.append(" BCA");
        System.out.println("After Append :"+sb);
        sb.insert(0,"P.");
        System.out.println("After Inserting "+sb);
        System.out.println("The  Checking Word Position is "+sb.lastIndexOf("I"));
        System.out.println("After Edit The String :"+sb.hashCode());
        //StringBuilder
        System.out.println();
        System.out.println("String Builder ");
        StringBuilder SB=new StringBuilder("kavi");
        System.out.println("Before Edit The String "+SB.hashCode());
        System.out.println("Length Of String :"+sb.length());
        sb.replace(0,1,"P");
        System.out.println("After Replace The String :"+SB);
        sb.append(" BSC");
        System.out.println("After Append :"+SB);
        sb.insert(0,"S.");
        System.out.println("After Inserting "+SB);
        System.out.println("The  Checking Word Position is "+SB.lastIndexOf("I"));
        System.out.println("After Edit The String :"+SB.hashCode());
    }
}
