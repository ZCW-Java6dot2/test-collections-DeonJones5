package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStack2(){
        Stack<String> stack = new Stack<>();
        stack.push("Deon");

        assertEquals("Deon", stack.pop());
    }

    @Test
    public void TestStack3() {
        Stack<String> stack = new Stack<>();
        stack.push("Deon");
        stack.push("Jones");

        assertTrue(stack.contains("Jones"));
    }



    // Make a bigger test exercising more Stack methods.....
}
