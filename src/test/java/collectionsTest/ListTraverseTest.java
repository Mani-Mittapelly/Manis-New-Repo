package collectionsTest;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static collections.RemoveLastElementArrayList.removeLastElement;
import static collections.TraverseArrayList.traverseList;

public class ListTraverseTest {
    @Test
    public void test1(){
        ArrayList<String> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");

        Assert.assertTrue(traverseList(al));

    }
    @Test
    public void test2(){
        ArrayList<String> al = new ArrayList<>();

        al.add("d");
        al.add("e");
        al.add("f");

        Assert.assertTrue(traverseList(al));

    }

    @Test
    public void test3(){
        ArrayList<String> al = new ArrayList<>();

        al.add("g");
        al.add(null);
        al.add("h");

        Assert.assertTrue(traverseList(al));

    }
}