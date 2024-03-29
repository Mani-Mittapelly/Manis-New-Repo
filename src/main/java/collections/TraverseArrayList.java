package collections;

import java.util.ArrayList;

public class TraverseArrayList {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

    }
    public static boolean traverseList(ArrayList<String> al){

        System.out.println("Printing using regular for loop : ");
        for(int i =0;i<al.size();i++)
            System.out.print(al.get(i)+" ");

        System.out.println();
        System.out.println("Printing using enhanced for loop : ");
        for(String element : al)
            System.out.print(element+ " ");

        return true;
    }
}