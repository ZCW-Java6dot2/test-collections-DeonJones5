package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;


public class TestLinkedList {
    @Test
    public void testLinkedList1(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(302);
        list.add(377);
        list.add(8790);

        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testLinkedList2(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Deon");
        list.add("Kendall");
        list.add("Jones");


        Assert.assertFalse("Kendall", list.remove(list));
    }
}
