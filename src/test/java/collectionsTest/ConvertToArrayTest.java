package collectionsTest;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static collections.ConvertToArray.convertToArray;

public class ConvertToArrayTest {
    @Test
    public void test1(){
        ArrayList<String> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");

        Assert.assertTrue(convertToArray(al) instanceof  String[]);

    }
    @Test
    public void test2(){
        ArrayList<String> al = new ArrayList<>();

        al.add("d");
        al.add("e");
        al.add("f");

        Assert.assertTrue(convertToArray(al) instanceof  String[]);

    }

    @Test
    public void test3(){
        ArrayList<String> al = new ArrayList<>();

        al.add("g");
        al.add(null);
        al.add("h");

        Assert.assertTrue(convertToArray(al) instanceof  String[]);

    }
}