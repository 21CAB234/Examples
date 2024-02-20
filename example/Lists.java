package example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lists {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        ArrayList list2=new ArrayList();
        list.add(100);
        list.add(true);
        list.add(234);
        list.add(1.0);
        list.add("java");
        System.out.println("List elements"+list);
        list.remove(1);
        System.out.println("After Remove"+list);
        System.out.println("After Sorting :");
        list2.addAll(list);
        System.out.println("List elements was copy to another list :"+list2);
        ArrayList<Integer> list3=new ArrayList<Integer>();
        list3.add(100);
        list3.add(1);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(50);
        System.out.println("Before Sorting  :"+list3);
        Collections.sort(list3);
        System.out.println("After Sorting :"+list3);
        list3.removeAll(list3);
        System.out.println("After Remove All elemets :"+list3);
    }
}
