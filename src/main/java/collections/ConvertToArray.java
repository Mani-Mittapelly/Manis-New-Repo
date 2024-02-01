package collections;

import java.util.ArrayList;

public class ConvertToArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

        Object[] array =  al.toArray();

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static Object[] convertToArray(ArrayList<String> al){
        return al.toArray();
    }
}