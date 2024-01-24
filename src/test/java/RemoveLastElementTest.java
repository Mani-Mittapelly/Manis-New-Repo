import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static collections.RemoveLastElementArrayList.removeLastElement;

public class RemoveLastElementTest {

    @Test
    public void test1(){
        ArrayList<String> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");

        Assert.assertEquals("manoj",removeLastElement(al));

    }
    @Test
    public void test2(){
        ArrayList<String> al = new ArrayList<>();

        al.add("x");
        al.add("y");
        al.add("z");

        Assert.assertEquals("chandu",removeLastElement(al));

    }

    @Test
    public void test3(){
        ArrayList<String> al = new ArrayList<>();

        al.add("ha");
        al.add(null);
        al.add("chandu");

        Assert.assertEquals("chandu",removeLastElement(al));

    }
}