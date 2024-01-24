package collections;

import java.util.ArrayList;

public class RemoveLastElementArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

        String lastelement = removeLastElement(al);
        System.out.println("last element that is removed is : "+lastelement);
        System.out.println("remaining elements : ");
        for(String element : al)
            System.out.println(element);
    }
    public static String removeLastElement(ArrayList<String> al){
        return al.remove(al.size()-1);
    }
}