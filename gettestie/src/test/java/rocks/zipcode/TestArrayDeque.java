package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque {

    @Test
    public void testArrayDeque1(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("Deon");
        arrayDeque.push("Bob");
        arrayDeque.push("Tim");
        arrayDeque.push("Mike");

        Assert.assertEquals("Mike", arrayDeque.pop());

    }
    @Test
    public void testArrayDeque2(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("Deon");
        arrayDeque.push("Bob");
        arrayDeque.push("Tim");
        arrayDeque.push("Mike");

        Assert.assertEquals("Deon", arrayDeque.peekLast());

    }
}
